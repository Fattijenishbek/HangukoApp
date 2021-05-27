package com.example.multiscreen;

public class Word {
    private String DefaultTranslation;
    private String KoreanTranslation;
    private int ImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED =-1;

    public Word(String DefaultTranslation, String MiwokTranslation) {
        this.DefaultTranslation = DefaultTranslation;
        this.KoreanTranslation = MiwokTranslation;
    }
    public Word(String DefaultTranslation, String MiwokTranslation,int ImageResourceId) {
        this.DefaultTranslation = DefaultTranslation;
        this.KoreanTranslation = MiwokTranslation;
        this.ImageResourceId = ImageResourceId;
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

    public boolean hasImage(){
        return ImageResourceId !=NO_IMAGE_PROVIDED;
    }
}

