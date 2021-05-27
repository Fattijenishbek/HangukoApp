package com.example.multiscreen;

public class Word {
    private String DefaultTranslation;
    private String KoreanTranslation;
    private int ImageResourceId;

    public Word(String DefaultTranslation, String MiwokTranslation) {
        this.DefaultTranslation = DefaultTranslation;
        this.KoreanTranslation = MiwokTranslation;
    }

    public String getDefaultTranslation() {
        return DefaultTranslation;
    }

    public String getKoreanTranslation() {
        return KoreanTranslation;
    }

    public int getImageResourceId(){
        return ImageResourceId;
    }
}

