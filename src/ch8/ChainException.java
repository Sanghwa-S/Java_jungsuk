package ch8;

public class ChainException {
	public static void main(String args[]) {
		try {
			install();
		}
		catch(InstallException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	static void install() throws InstallException {
		try {
			startInstall();
			copyFiles();
		}
		catch(SpaceException se){
			
			// 예외 SpaceException 이 InstallExcpetion 예외를 발생시켰다.
			
			InstallException ie = new InstallException("설치중 예외 발생"); //예외 생성
			ie.initCause(se); //SpaceException (원인 예외) 
			throw ie;
		}
		catch (MemoryException me){
			// 예외 MemoryException 이 InstallException 을 발생시켰다.
			InstallException ie = new InstallException("설치중 예외 발생");
			ie.initCause(me);
			throw ie;
		}
		finally {
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

class InstallException extends Exception {
	InstallException(String msg){
		super(msg);
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
