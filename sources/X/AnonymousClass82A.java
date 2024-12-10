package X;

import com.whatsapp.calling.calllink.view.CreateCallLinkBottomSheet;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import java.util.List;

/* renamed from: X.82A  reason: invalid class name */
public final class AnonymousClass82A extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C1417476u $viewState;
    public final /* synthetic */ CreateCallLinkBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass82A(CreateCallLinkBottomSheet createCallLinkBottomSheet, C1417476u r3) {
        super(1);
        this.this$0 = createCallLinkBottomSheet;
        this.$viewState = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Integer num;
        CreateCallLinkBottomSheet createCallLinkBottomSheet = this.this$0;
        C1417476u r2 = this.$viewState;
        if (r2.A03 == 1) {
            if (C72453Mb.A1a(createCallLinkBottomSheet.A0W)) {
                AnonymousClass00H r0 = createCallLinkBottomSheet.A0O;
                if (r0 != null) {
                    C194859sP r6 = (C194859sP) C18070vi.A0E(r0);
                    boolean A00 = r2.A00();
                    int i = 31;
                    if (A00) {
                        i = 16;
                    }
                    C36321nh r02 = GroupJid.Companion;
                    C18100vl r4 = createCallLinkBottomSheet.A0V;
                    GroupJid A002 = C36321nh.A00((Jid) r4.getValue());
                    if (A002 != null) {
                        AnonymousClass00H r03 = createCallLinkBottomSheet.A0M;
                        if (r03 != null) {
                            num = C72473Md.A0d(A002, r03);
                        } else {
                            C18070vi.A11("groupParticipantsManagerLazy");
                            throw null;
                        }
                    } else {
                        num = null;
                    }
                    r6.A01((Boolean) null, (Boolean) null, 25, num, (Integer) null, i);
                    AnonymousClass00H r04 = createCallLinkBottomSheet.A0L;
                    if (r04 != null) {
                        ((C88184Yq) r04.get()).A03(19);
                        C1182662u A02 = AnonymousClass74H.A02((String) null, 3, 6, A00);
                        AnonymousClass00H r05 = createCallLinkBottomSheet.A0J;
                        if (r05 != null) {
                            ((A4u) r05.get()).A03(A02);
                            AnonymousClass00H r06 = createCallLinkBottomSheet.A0P;
                            if (r06 != null) {
                                C33251iW r5 = (C33251iW) r06.get();
                                Object value = r4.getValue();
                                if (value != null) {
                                    r5.A0O(createCallLinkBottomSheet.A09, (AnonymousClass206) null, (C692236j) null, r2.A05, C18070vi.A0M(value), (List) null, false, false);
                                    createCallLinkBottomSheet.A28();
                                } else {
                                    throw C17890vO.A0K();
                                }
                            } else {
                                C18070vi.A11("userActions");
                                throw null;
                            }
                        } else {
                            C18070vi.A11("callingWamEventHelperLazy");
                            throw null;
                        }
                    } else {
                        C18070vi.A11("conversationAttachmentEventLoggerLazy");
                        throw null;
                    }
                } else {
                    C18070vi.A11("preCallChatThreadLoggerLazy");
                    throw null;
                }
            } else if (C72453Mb.A1a(createCallLinkBottomSheet.A0Y)) {
                CreateCallLinkBottomSheet.A03(createCallLinkBottomSheet, r2);
            } else {
                CreateCallLinkBottomSheet.A04(createCallLinkBottomSheet, r2);
            }
        }
        return C27621Wu.A00;
    }
}
