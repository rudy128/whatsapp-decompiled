package X;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.1MS  reason: invalid class name */
public final class AnonymousClass1MS extends C24741Lm {
    public final int A00;
    public final AnonymousClass1MT A01;
    public final AnonymousClass1CJ A02;
    public final AnonymousClass1Cd A03;
    public final C24751Ln A04;
    public final Map A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1MS(AnonymousClass1CJ r3, AnonymousClass1Cd r4, C24751Ln r5, C18030ve r6, C24571Kv r7) {
        super(r7);
        C18070vi.A0d(r6, 1);
        C18070vi.A0d(r3, 2);
        C18070vi.A0d(r5, 3);
        C18070vi.A0d(r4, 4);
        C18070vi.A0d(r7, 5);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        AnonymousClass1MT r0 = new AnonymousClass1MT();
        this.A02 = r3;
        this.A04 = r5;
        this.A03 = r4;
        this.A05 = concurrentHashMap;
        this.A01 = r0;
        int A002 = C18020vd.A00(C18040vf.A02, r6, 7862);
        this.A00 = A002;
        if (A002 >= 0) {
            A09();
        }
    }

    public final C63872tp A0A(AnonymousClass1E9 r2) {
        C18070vi.A0d(r2, 0);
        return (C63872tp) this.A05.get(r2);
    }

    public void C9L(C122516Qr r3, boolean z) {
        C18070vi.A0d(r3, 1);
        if (r3.ordinal() >= this.A00) {
            this.A05.clear();
        }
    }

    public String BZc() {
        StringBuilder sb = new StringBuilder();
        sb.append("GroupParticipantCache/");
        sb.append(this.A05.size());
        return sb.toString();
    }
}
