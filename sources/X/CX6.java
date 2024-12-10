package X;

public class CX6 {
    public int A00 = -1;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public CPK[] A05;

    public void A00() {
        if (this.A05 != null) {
            int i = 0;
            while (true) {
                CPK[] cpkArr = this.A05;
                if (i >= cpkArr.length) {
                    break;
                }
                if (cpkArr[i].A02 != null) {
                    cpkArr[i].A02.clear();
                }
                i++;
            }
        }
        this.A05 = null;
    }
}
