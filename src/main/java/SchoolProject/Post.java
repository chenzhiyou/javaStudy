package SchoolProject;

public class Post {
    private String postNum;
    private String postName;

    public Post(){

    }

    public Post(String postNum, String postName){
        this.setPostName(postName);
        this.setPostNum(postNum);

    }

    public String getPostNum() {
        return postNum;
    }

    public void setPostNum(String postNum) {
        this.postNum = postNum;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }



}
