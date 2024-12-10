package X;

/* renamed from: X.AgX  reason: case insensitive filesystem */
public final class C21224AgX implements C22470B9c {
    public static final C21224AgX A00 = new C21224AgX();

    public final Object BCF(C29621ca r7, C62672rm r8) {
        char A17 = C18070vi.A17(r7, r8);
        if (!r8.A09(r7, "participant") || !r8.A09(r7, "participant")) {
            return null;
        }
        C22470B9c[] b9cArr = new C22470B9c[5];
        b9cArr[0] = C21233Agg.A00;
        b9cArr[A17] = C21234Agh.A00;
        b9cArr[2] = C21235Agi.A00;
        b9cArr[3] = C21236Agj.A00;
        Object A06 = r8.A06(r7, "ParticipantWithJidLidAndDisplayName|ParticipantWithJidContainingLidAndDisplayName|ParticipantWithJidAndLid|ParticipantWithJidAndPn|ParticipantWithJid", C18070vi.A0O(C21237Agk.A00, b9cArr, 4), new String[0]);
        if (A06 != null) {
            return new AnonymousClass9E4(r7, new AnonymousClass9DO(r7, (B6N) A06));
        }
        return null;
    }
}
