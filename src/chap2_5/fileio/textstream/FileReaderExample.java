package chap2_5.fileio.textstream;

import chap2_5.fileio.FileExample;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileReaderExample {


    public static void main(String[] args) {

        try(FileReader fr = new FileReader(FileExample.ROOT_PATH+"/hobby.txt")){

            // 텍스트를 라인단위로 읽는 보조스트림
            BufferedReader br = new BufferedReader(fr);

            while(true){ // 한줄 바뀔때마다 계속 readline을 적어야하므로 반복문으로 설정
            String data = br.readLine();

            if(data == null) break; // 더이상 읽을게 없으면

            System.out.println(data);

            }

        }catch (Exception e){
            System.out.println("파일로드에 실패했습니다.");
        }
    }
}
