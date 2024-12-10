package X;

import java.util.regex.Pattern;

/* renamed from: X.AaM  reason: case insensitive filesystem */
public final class C20844AaM implements BBV {
    public static CharSequence A00(CharSequence charSequence) {
        C18070vi.A0d(charSequence, 0);
        CharSequence A0G = AnonymousClass1YF.A0G(charSequence);
        if (A0G.length() == 0) {
            return charSequence;
        }
        String obj = A0G.toString();
        if (!AnonymousClass1YE.A0A(obj, "+", false)) {
            obj = AnonymousClass001.A1H("+55", obj, AnonymousClass000.A10());
        }
        return C17890vO.A0Z(C108985cd.A0o(obj, "[^\\d]"), AnonymousClass000.A10(), obj.charAt(0));
    }

    public /* bridge */ /* synthetic */ boolean Bgx(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        if (charSequence == null) {
            return false;
        }
        Pattern compile = Pattern.compile("^\\+[1-9]\\d{1,14}$");
        String obj2 = A00(charSequence).toString();
        if (AnonymousClass1YE.A0A(obj2, "+55", false)) {
            return compile.matcher(obj2).find();
        }
        return false;
    }

    public /* bridge */ /* synthetic */ CharSequence CGb(Object obj) {
        return A00((CharSequence) obj);
    }
}
