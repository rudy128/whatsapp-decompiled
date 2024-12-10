package X;

/* renamed from: X.1zu  reason: invalid class name and case insensitive filesystem */
public abstract /* synthetic */ class C43501zu {
    public static /* synthetic */ String A00(CharSequence charSequence, CharSequence[] charSequenceArr) {
        StringBuilder sb = new StringBuilder();
        int length = charSequenceArr.length;
        if (length > 0) {
            sb.append(charSequenceArr[0]);
            for (int i = 1; i < length; i++) {
                sb.append(charSequence);
                sb.append(charSequenceArr[i]);
            }
        }
        return sb.toString();
    }

    public static void A01(StringBuilder sb, CharSequence[] charSequenceArr) {
        sb.append(A00(", ", charSequenceArr));
        sb.append(" FROM ");
    }
}
