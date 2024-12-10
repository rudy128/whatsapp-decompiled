package X;

public final class CMO {
    public final CharSequence A00;
    public final CharSequence A01;

    public CMO(CharSequence charSequence, CharSequence charSequence2) {
        this.A01 = charSequence;
        this.A00 = charSequence2;
        if (charSequence.length() <= 0) {
            throw AnonymousClass000.A0k("userId should not be empty");
        }
    }
}
