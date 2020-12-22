package be.pxl.ja.streamingservice.model;

public abstract class Content {
    private String title;
    private be.pxl.ja1.Rating maturityRating;
    private String imgUrl;

    public Content(String title, be.pxl.ja1.Rating maturityRating) {
        this.title = title;
        this.maturityRating = maturityRating;
    }

    public String getTitle() {
        return title;
    }

    public be.pxl.ja1.Rating getMaturityRating() {
        return maturityRating;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    @Override
    public String toString(){
        return title;
    }
}
