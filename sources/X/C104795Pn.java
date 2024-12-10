package X;

/* renamed from: X.5Pn  reason: invalid class name and case insensitive filesystem */
public final class C104795Pn extends AnonymousClass11G implements C18090vk {
    public static final C104795Pn A00 = new C104795Pn();

    public C104795Pn() {
        super(0);
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass1D6[] r5 = new AnonymousClass1D6[7];
        AnonymousClass4DF r1 = AnonymousClass4DF.ONE_ON_ONE_NOT_IN_CONTACTS_COMPANION;
        AnonymousClass4DJ[] r0 = new AnonymousClass4DJ[3];
        AnonymousClass4DJ r11 = AnonymousClass4DJ.MESSAGE;
        r0[0] = r11;
        AnonymousClass4DJ r10 = AnonymousClass4DJ.VOICE;
        r0[1] = r10;
        AnonymousClass4DJ r4 = AnonymousClass4DJ.VIDEO;
        AnonymousClass1D6.A03(r1, C18070vi.A0O(r4, r0, 2), r5, 0);
        AnonymousClass4DF r12 = AnonymousClass4DF.ONE_ON_ONE_IN_CONTACTS;
        AnonymousClass4DJ[] r02 = new AnonymousClass4DJ[3];
        r02[0] = r11;
        AnonymousClass1D6.A03(r12, C18070vi.A0N(r10, r4, r02, 1, 2), r5, 1);
        AnonymousClass4DF r2 = AnonymousClass4DF.ONE_ON_ONE_NOT_IN_CONTACTS;
        AnonymousClass4DJ[] r13 = new AnonymousClass4DJ[4];
        r13[0] = r11;
        r13[1] = r10;
        r13[2] = r4;
        AnonymousClass1D6.A03(r2, C18070vi.A0O(AnonymousClass4DJ.SAVE, r13, 3), r5, 2);
        AnonymousClass4DF r22 = AnonymousClass4DF.LGC;
        AnonymousClass4DJ[] r14 = new AnonymousClass4DJ[4];
        r14[0] = r11;
        r14[1] = r10;
        AnonymousClass1D6.A03(r22, C18070vi.A0N(AnonymousClass4DJ.VOICE_CHAT, r4, r14, 2, 3), r5, 3);
        AnonymousClass1D6.A03(AnonymousClass4DF.ADHOC_GROUP_CALL, C18070vi.A0N(r10, r4, new AnonymousClass4DJ[2], 0, 1), r5, 4);
        AnonymousClass4DF r23 = AnonymousClass4DF.CALL_LINK_AUDIO;
        AnonymousClass4DJ[] r15 = new AnonymousClass4DJ[3];
        r15[0] = AnonymousClass4DJ.JOIN_CALL_LINK_AUDIO;
        AnonymousClass4DJ r42 = AnonymousClass4DJ.SEND_LINK;
        r15[1] = r42;
        AnonymousClass4DJ r3 = AnonymousClass4DJ.SHARE;
        r5[5] = AnonymousClass1D6.A01(r23, C18070vi.A0O(r3, r15, 2));
        AnonymousClass4DF r24 = AnonymousClass4DF.CALL_LINK_VIDEO;
        AnonymousClass4DJ[] r16 = new AnonymousClass4DJ[3];
        r16[0] = AnonymousClass4DJ.JOIN_CALL_LINK_VIDEO;
        r5[6] = AnonymousClass1D6.A01(r24, C18070vi.A0N(r42, r3, r16, 1, 2));
        return AnonymousClass1D7.A0B(r5);
    }
}
