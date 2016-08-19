package 公用包;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Jianting {
	private ServerSocket	aServerSocket;
	Tongzhi					aTongzhi;

	public Jianting(Tongzhi aTongzhi) throws IOException {
		try {
			aServerSocket = new ServerSocket(8799);
		} catch (IOException e) {
			for (int i = 8800; i < 8900; i++) {
				try {
					aServerSocket = new ServerSocket(i);
					break;
				} catch (IOException e1) {
					if (i == 8899) {
						throw e1;
					}
				}
			}
		}
		this.aTongzhi = aTongzhi;
		lianjie();
	}

	void lianjie() {
		while (aServerSocket.isClosed() != true) {
			try {
				Socket aSocket = aServerSocket.accept();
				if (aSocket != null && aSocket.isClosed()) {
					InputStream aInputStream = aSocket.getInputStream();
					int a = aInputStream.read();
					if (a != -1) {
						if (aTongzhi.shoudao(a)) {
							byte[] b = new byte[500];
							a = aInputStream.read(b);
							while (a != -1) {
								if (a > 0) {
									if (aTongzhi.shuju(b) == false) {
										break;
									}
								}
								a = aInputStream.read(b);
							}
						}
					}
					aSocket.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
