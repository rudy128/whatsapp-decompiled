package X;

import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.mediaview.MediaViewCurrentMessageViewModel;
import com.whatsapp.status.playback.MessageReplyActivity;
import com.whatsapp.status.playback.StatusReplyActivity;
import com.whatsapp.updates.viewmodels.UpdatesViewModel;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.7FO  reason: invalid class name */
public class AnonymousClass7FO implements AnonymousClass1WR, AnonymousClass1WS, C23971Ii {
    public final int A00;
    public final Object A01;

    public AnonymousClass7FO(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public /* synthetic */ void BmY(AnonymousClass206 r6, int i) {
        if (2 - this.A00 == 0) {
            C18070vi.A0d(r6, 0);
            StatusReplyActivity statusReplyActivity = (StatusReplyActivity) this.A01;
            HashMap hashMap = MessageReplyActivity.A1v;
            boolean z = !C108965cb.A1b(statusReplyActivity.A05, r6.A0u);
            AnonymousClass205 r2 = r6.A0v;
            if (C18070vi.A18(r2.A00, statusReplyActivity.A0h) && r2.A02 && z) {
                C33001i6 r1 = statusReplyActivity.A00;
                if (r1 != null) {
                    r1.A03(r2, 4);
                } else {
                    C18070vi.A11("messageThreadAnalyticsTracker");
                    throw null;
                }
            }
        }
    }

    public /* synthetic */ void ByH(AnonymousClass206 r8, int i) {
        if (1 - this.A00 == 0) {
            AnonymousClass206 r4 = r8;
            C18070vi.A0d(r8, 0);
            AnonymousClass7CM r2 = (AnonymousClass7CM) this.A01;
            AnonymousClass1BI r3 = r8.A0v.A00;
            if (r3 instanceof PhoneUserJid) {
                ((C200710s) r2.A04.getValue()).execute(new C146607Px(r2, r3, r4, i, 3));
            }
        }
    }

    public void ByK(AnonymousClass206 r7, int i) {
        AnonymousClass21V r0;
        C46162Dk r1;
        Boolean bool;
        AnonymousClass205 r02;
        switch (this.A00) {
            case 0:
                C18070vi.A0d(r7, 0);
                MediaViewCurrentMessageViewModel mediaViewCurrentMessageViewModel = (MediaViewCurrentMessageViewModel) this.A01;
                C135816so r03 = (C135816so) mediaViewCurrentMessageViewModel.A00.A06();
                if (r03 != null) {
                    r0 = r03.A01;
                } else {
                    r0 = null;
                }
                if (r7.equals(r0)) {
                    if (i == 27 || i == 28 || i == 39 || i == 40) {
                        mediaViewCurrentMessageViewModel.A0U();
                    }
                    mediaViewCurrentMessageViewModel.A0T();
                    return;
                }
                return;
            case 3:
                AnonymousClass205 A0U = C108965cb.A0U(r7);
                AnonymousClass1BI r12 = A0U.A00;
                if (r7.A0w() && r12 != null) {
                    UpdatesViewModel updatesViewModel = (UpdatesViewModel) this.A01;
                    C29691ci A002 = AnonymousClass1CJ.A00(((C35681md) updatesViewModel.A0d.get()).A0E, r12);
                    if (A002 instanceof C46162Dk) {
                        r1 = (C46162Dk) A002;
                    } else {
                        r1 = null;
                    }
                    if (r1 != null) {
                        bool = Boolean.valueOf(r1.A0P());
                    } else {
                        bool = null;
                    }
                    if (C72463Mc.A1Y(bool) && r7.A0D() >= 4) {
                        for (Object next : UpdatesViewModel.A05(updatesViewModel)) {
                            AnonymousClass206 A003 = ((C121346Jh) next).A00();
                            if (A003 != null) {
                                r02 = A003.A0v;
                            } else {
                                r02 = null;
                            }
                            if (C18070vi.A18(r02, A0U)) {
                                if (next != null) {
                                    UpdatesViewModel.A0E(updatesViewModel);
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    public /* synthetic */ void BsP(AnonymousClass206 r1) {
    }

    public /* synthetic */ void Bwj(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void ByG(AnonymousClass206 r1) {
    }

    public /* synthetic */ void ByN(AnonymousClass206 r1) {
    }

    public /* synthetic */ void ByR(AnonymousClass206 r1) {
    }

    public /* synthetic */ void ByZ(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void Byb(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void Byd(Collection collection) {
    }

    public /* synthetic */ void Bz8(C29681ch r1) {
    }

    public /* synthetic */ void Bz9(AnonymousClass206 r1) {
    }

    public /* synthetic */ void BzC(C29681ch r1) {
    }

    public /* synthetic */ void ByQ(AnonymousClass206 r1, AnonymousClass206 r2) {
    }

    public /* synthetic */ void ByY(Collection collection, int i) {
        AnonymousClass2TK.A00(this, collection, i);
    }

    public /* synthetic */ void Bya(Collection collection, Map map) {
    }

    public /* synthetic */ void BzA(C29681ch r1, boolean z) {
    }

    public /* synthetic */ void C0d(AnonymousClass206 r1, AnonymousClass206 r2) {
    }

    public /* synthetic */ void C0h(AnonymousClass206 r1, AnonymousClass206 r2) {
    }

    public /* synthetic */ void Byc(AnonymousClass1BI r1, Collection collection, boolean z) {
    }
}
