package s06_ke_thua.baitap.point2D_3D;

public class point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public point2D (float x, float y) {
        this.x=x;
        this.y=y;
    }

    public point2D() {

    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x,float y) {
        this.x=x;
        this.y=y;
    }
    public float[] getXY(){
        float[] test =new float[2];
        test[0] = this.x;
        test[1] = this.y;
        return test;
    }

    @Override
    public String toString() {
        return "("+this.x+","+this.y+")";
    }
}
