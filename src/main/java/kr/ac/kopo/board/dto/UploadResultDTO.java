package kr.ac.kopo.board.dto;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class UploadResultDTO implements Serializable {
    private String fileName;
    private String uuid;
    private String folderPath;

    public String getImageURL() {
        try {
            // 파일 경로와 이름을 URL-인코딩하여 반환
            return URLEncoder.encode(folderPath + "/" + uuid + "_" + fileName, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return "";
    }
}