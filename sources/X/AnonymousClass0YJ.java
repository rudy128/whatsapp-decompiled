package X;

import com.facebook.flexlayout.layoutoutput.LayoutOutput;

/* renamed from: X.0YJ  reason: invalid class name */
public class AnonymousClass0YJ implements C16930tS {
    public final Integer[] A00;
    public final LayoutOutput A01;
    public final C05050Qf A02;

    public Object BTv() {
        return null;
    }

    public int BW0() {
        return 0;
    }

    public int BW2() {
        return 0;
    }

    public int BW3() {
        return 0;
    }

    public int BW5() {
        return 0;
    }

    public C16930tS BOa(int i) {
        LayoutOutput layoutOutput = this.A01;
        Integer[] numArr = this.A00;
        if (numArr != null && numArr.length > i) {
            i = numArr[i].intValue();
        }
        return (C16930tS) layoutOutput.getMeasureResultForChildAt(i);
    }

    public int BOk() {
        return this.A01.getChildrenCount();
    }

    public int Bbx(int i) {
        LayoutOutput layoutOutput = this.A01;
        Integer[] numArr = this.A00;
        if (numArr != null && numArr.length > i) {
            i = numArr[i].intValue();
        }
        return (int) layoutOutput.getLeftForChildAt(i);
    }

    public int Bby(int i) {
        LayoutOutput layoutOutput = this.A01;
        Integer[] numArr = this.A00;
        if (numArr != null && numArr.length > i) {
            i = numArr[i].intValue();
        }
        return (int) layoutOutput.getTopForChildAt(i);
    }

    public int getHeight() {
        return (int) this.A01.getHeight();
    }

    public int getWidth() {
        return (int) this.A01.getWidth();
    }

    public AnonymousClass0YJ(LayoutOutput layoutOutput, C05050Qf r2, Integer[] numArr) {
        this.A01 = layoutOutput;
        this.A02 = r2;
        this.A00 = numArr;
    }

    public C05050Qf BY6() {
        return this.A02;
    }

    public /* synthetic */ AnonymousClass0YJ(LayoutOutput layoutOutput) {
        this(layoutOutput, (C05050Qf) null, (Integer[]) null);
    }
}
