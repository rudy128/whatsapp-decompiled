package X;

import java.util.regex.Pattern;

/* renamed from: X.AaK  reason: case insensitive filesystem */
public final class C20842AaK implements BBV {
    public /* bridge */ /* synthetic */ boolean Bgx(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        if (charSequence == null || charSequence.length() == 0) {
            return false;
        }
        return !Pattern.compile("[=#|^]").matcher(charSequence.toString()).find();
    }

    public /* bridge */ /* synthetic */ CharSequence CGb(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        C18070vi.A0d(charSequence, 0);
        return charSequence;
    }
}
