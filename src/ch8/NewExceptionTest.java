package ch8;

public class NewExceptionTest {

	public static void main(String args[]) {
		try {
			startInstall();
			copyFiles();
		}
		catch(SpaceException se) {
			System.out.println("에러 메세지: " + se.getMessage());
			se.printStackTrace();
			System.out.println("공간을 확보한 후에 다시 설치하시기 바랍니다.");
		}
		catch(MemoryException me) {
			System.out.println("에러 메세지: " + me.getMessage());
			me.printStackTrace();
			System.gc();
			System.out.println("다시 설치를 시도하세요.");
		}
		finally{
			deletTempFiles();
		}
		
	}
	
	static void startInstall() throws SpaceException, MemoryException {
		if(!enoughSpace())
			throw new SpaceException("설치할 공간이 부족합니다.");
		if(!enoughMemory())
			throw new MemoryException("메모리가 부족합니다.");
	}
	
	static void copyFiles() {/*type the code that copies the files*/}
	static void deletTempFiles() {/*type the code that deletes the temporary files.*/}
	
	static boolean enoughSpace() {
		return false;//type the code which checks the enough space for the install
	}
	
	static boolean enoughMemory() {
		return true; //type the code which checks the enough memory for the install
	}
	
}

class SpaceException extends Exception {
	SpaceException(String msg){
		super(msg);
	}
}

class MemoryException extends Exception {
	MemoryException(String msg){
		super(msg);
	}
}
