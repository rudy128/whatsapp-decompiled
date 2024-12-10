package X;

import java.util.LinkedHashMap;
import java.util.Locale;

/* renamed from: X.1nO  reason: invalid class name and case insensitive filesystem */
public final class C36131nO extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C36121nN this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36131nO(C36121nN r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Object obj = this.this$0.A00.get();
        C18070vi.A0X(obj);
        Iterable iterable = (Iterable) obj;
        int A03 = C200610r.A03(C29351c6.A0C(iterable, 10));
        if (A03 < 16) {
            A03 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A03);
        for (Object next : iterable) {
            String A01 = ((AnonymousClass2SE) next).A01();
            Locale locale = Locale.US;
            C18070vi.A0Z(locale);
            String lowerCase = A01.toLowerCase(locale);
            C18070vi.A0X(lowerCase);
            linkedHashMap.put(lowerCase, next);
        }
        return linkedHashMap;
    }
}
