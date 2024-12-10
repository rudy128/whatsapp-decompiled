package X;

/* renamed from: X.Aby  reason: case insensitive filesystem */
public final class C20944Aby implements AnonymousClass25D {
    public final AnonymousClass9IU A00;
    public final Integer A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C20944Aby) {
                C20944Aby aby = (C20944Aby) obj;
                if (!(this.A00 == aby.A00 && this.A01 == aby.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str;
        int hashCode;
        int A0L = AnonymousClass000.A0L(this.A00);
        Integer num = this.A01;
        if (num == null) {
            hashCode = 0;
        } else {
            int intValue = num.intValue();
            if (1 != intValue) {
                str = "AVAILABLE";
            } else {
                str = "QUOTA_EXCEED_LIMIT";
            }
            hashCode = str.hashCode() + intValue;
        }
        return A0L + hashCode;
    }

    public C20944Aby(AnonymousClass9IU r1, Integer num) {
        this.A00 = r1;
        this.A01 = num;
    }

    public String toString() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BotModelMetadata(modelType=");
        A10.append(this.A00);
        A10.append(", premiumModelStatus=");
        Integer num = this.A01;
        if (num == null) {
            str = "null";
        } else if (1 - num.intValue() != 0) {
            str = "AVAILABLE";
        } else {
            str = "QUOTA_EXCEED_LIMIT";
        }
        return C17900vP.A0B(str, A10);
    }
}
