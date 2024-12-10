package X;

import java.util.List;

public final class A22 {
    public final List A00;
    public final int A01;
    public final int A02;
    public final Integer A03;
    public final Integer A04;
    public final String A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof A22) {
                A22 a22 = (A22) obj;
                if (!(C18070vi.A18(this.A00, a22.A00) && this.A03 == a22.A03 && this.A01 == a22.A01 && this.A02 == a22.A02 && this.A04 == a22.A04 && C18070vi.A18(this.A05, a22.A05))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str;
        int A0L = AnonymousClass000.A0L(this.A00);
        Integer num = this.A03;
        int A0E = (((((A0L + C72453Mb.A0E(num, A00(num))) * 31) + this.A01) * 31) + this.A02) * 31;
        int intValue = this.A04.intValue();
        if (intValue != 0) {
            str = "SUCCESS";
        } else {
            str = "FAILURE";
        }
        return C108945cZ.A09(this.A05, AnonymousClass8BW.A03(str, intValue, A0E));
    }

    public A22(Integer num, Integer num2, String str, List list, int i, int i2) {
        this.A00 = list;
        this.A03 = num;
        this.A01 = i;
        this.A02 = i2;
        this.A04 = num2;
        this.A05 = str;
    }

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "AIM_MODEL_BATCHED_MANIFEST";
            case 1:
                return "AIM_MODEL_MANIFEST";
            case 2:
                return "AIM_MODEL_MANIFEST_GRAPH_API";
            case 3:
                return "AIM_MODEL_VERSION_MANIFEST";
            case 4:
                return "LIGHTSPEED_ML_MODEL";
            case 5:
                return "NATIVE_ML_MODEL";
            default:
                return "NATIVE_ML_MODELS";
        }
    }

    public String toString() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AIMModelManifest(models=");
        A10.append(this.A00);
        A10.append(", entryPoint=");
        A10.append(A00(this.A03));
        A10.append(", assetCount=");
        A10.append(this.A01);
        A10.append(", modelCount=");
        A10.append(this.A02);
        A10.append(", status=");
        if (this.A04.intValue() != 0) {
            str = "SUCCESS";
        } else {
            str = "FAILURE";
        }
        A10.append(str);
        A10.append(", statusDetails=");
        return C17900vP.A0B(this.A05, A10);
    }
}
