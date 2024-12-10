package X;

public class CWJ {
    public final Integer A00;
    public final Integer A01;
    public final Integer A02;

    public CWJ(Integer num, Integer num2, Integer num3) {
        this.A00 = num;
        this.A02 = num2;
        this.A01 = num3;
    }

    public String toString() {
        String obj;
        StringBuilder A0q = BE9.A0q();
        Integer num = this.A00;
        String str = "";
        if (num == null) {
            obj = str;
        } else {
            obj = num.toString();
        }
        A0q.append(obj);
        A0q.append(":");
        Integer num2 = this.A02;
        if (num2 != null) {
            str = num2.toString();
        }
        return BEA.A0m(str, A0q);
    }
}
