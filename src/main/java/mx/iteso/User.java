package mx.iteso;

public abstract class User {

    private boolean publish = false;
    private boolean approve = false;
    private boolean delete = false;
    private boolean comment = false;
    private String publishContent = "";


    public abstract void setPrivilegs( );

    public boolean isPublish() {
        return publish;
    }

    public void setPublish(boolean publish) {
        this.publish = publish;
        if(publish){
            setPublishContent("everyone");
        }else {
            setPublishContent("own");
        }
    }

    public boolean isApprove() {
        return approve;
    }

    public void setApprove(boolean approve) {
        this.approve = approve;
    }

    public boolean isDelete() {
        return delete;
    }

    public void setDelete(boolean delete) {
        this.delete = delete;
    }

    public boolean isComment() {
        return comment;
    }

    public void setComment(boolean comment) {
        this.comment = comment;
    }

    public String getPublishContent() {
        return publishContent;
    }

    private void setPublishContent(String publishContent) {
        this.publishContent = publishContent;
    }

    @Override
    public String toString() {


        return "User{" +
                ", approve=" + isApprove() +
                ", delete=" + isDelete() +
                ", comment=" + isComment() +
                ", publishContent='" + getPublishContent() + '\'' +
                '}';
    }
}
