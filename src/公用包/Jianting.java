package 公用包;

import java.io.IOException;
import java.net.ServerSocket;

public class Jianting {
	private ServerSocket aServerSocket;

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
	}

}
