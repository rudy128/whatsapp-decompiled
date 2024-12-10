package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.chatinfo.ContactInfoActivity;
import com.whatsapp.conversation.ConversationListView;
import com.whatsapp.gallery.MediaGalleryFragmentBase;
import com.whatsapp.gallery.viewmodel.MediaGalleryFragmentViewModel;
import com.whatsapp.gallery.viewmodel.MediaGalleryFragmentViewModel$loadSections$1;
import com.whatsapp.jid.PhoneUserJid;
import java.util.List;
import java.util.Set;

/* renamed from: X.7RR  reason: invalid class name */
public class AnonymousClass7RR implements Runnable {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final boolean A04;

    public AnonymousClass7RR(C33251iW r2, AnonymousClass206 r3, int i) {
        this.A00 = 7;
        this.A02 = r2;
        this.A03 = r3;
        this.A04 = true;
        this.A01 = i;
    }

    public void run() {
        boolean z;
        C21469Aka aka;
        C23691Hg r1;
        switch (this.A00) {
            case 0:
                boolean z2 = this.A04;
                C20359AHp aHp = (C20359AHp) this.A02;
                AnonymousClass9UL r12 = (AnonymousClass9UL) this.A03;
                int i = this.A01;
                String str = r12.A00.A01;
                if (z2) {
                    synchronized (aHp.A09) {
                        aka = C20359AHp.A00(aHp, str);
                    }
                } else {
                    synchronized (aHp.A09) {
                        if (aHp.A05.get(str) != null) {
                            A5Z A002 = A5Z.A00();
                            String str2 = C20359AHp.A0B;
                            StringBuilder A10 = AnonymousClass000.A10();
                            A10.append("Ignored stopWork. WorkerWrapper ");
                            A10.append(str);
                            A002.A03(str2, AnonymousClass000.A0y(" is in foreground", A10));
                        } else {
                            Set set = (Set) aHp.A06.get(str);
                            if (set != null && set.contains(r12)) {
                                aka = C20359AHp.A00(aHp, str);
                            }
                        }
                        z = false;
                    }
                    A5Z A003 = A5Z.A00();
                    String A012 = A5Z.A01("StopWorkRunnable");
                    StringBuilder A102 = AnonymousClass000.A10();
                    A102.append("StopWorkRunnable for ");
                    A102.append(str);
                    A003.A03(A012, C17900vP.A0D("; Processor.stopWork = ", A102, z));
                    return;
                }
                z = C20359AHp.A01(aka, str, i);
                A5Z A0032 = A5Z.A00();
                String A0122 = A5Z.A01("StopWorkRunnable");
                StringBuilder A1022 = AnonymousClass000.A10();
                A1022.append("StopWorkRunnable for ");
                A1022.append(str);
                A0032.A03(A0122, C17900vP.A0D("; Processor.stopWork = ", A1022, z));
                return;
            case 1:
                C22646BHi bHi = (C22646BHi) this.A02;
                View view = (View) this.A03;
                boolean z3 = this.A04;
                int i2 = this.A01;
                if (bHi.A04 != null) {
                    int height = bHi.getHeight();
                    int BXI = height - bHi.A04.BXI(view, height);
                    C26247Cvl cvl = bHi.A05;
                    int i3 = cvl.A03;
                    if (z3) {
                        view.offsetTopAndBottom(BXI - view.getTop());
                        return;
                    }
                    cvl.A08 = view;
                    cvl.A02 = -1;
                    if (C26247Cvl.A05(cvl, BXI, 0, i2)) {
                        bHi.postInvalidateOnAnimation();
                        return;
                    }
                    List<E7I> list = bHi.A0H;
                    if (!list.isEmpty() && i3 == 0) {
                        for (E7I C10 : list) {
                            C10.C10(view, bHi.A04);
                        }
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ContactInfoActivity contactInfoActivity = (ContactInfoActivity) this.A02;
                boolean z4 = this.A04;
                int i4 = this.A01;
                PhoneUserJid A0D = contactInfoActivity.A10.A0D((AnonymousClass1E1) ((AnonymousClass1BI) this.A03));
                if (A0D != null) {
                    contactInfoActivity.A05.A0J(new AnonymousClass7RR(contactInfoActivity, A0D, i4, 3, z4));
                    return;
                }
                return;
            case 3:
                ((ContactInfoActivity) this.A02).A4p((AnonymousClass1BI) this.A03, Boolean.valueOf(this.A04), Integer.valueOf(this.A01));
                return;
            case 4:
                ((ConversationListView) this.A02).A0A((AnonymousClass206) this.A03, -1, true);
                return;
            case 5:
                int i5 = this.A01;
                boolean z5 = this.A04;
                ((A5M) ((C32791hl) this.A02).A02.get()).A03((AnonymousClass1BI) this.A03, (Integer) null, (String) null, (String) null, i5, 11, false, z5);
                return;
            case 6:
                int i6 = this.A01;
                ((C88104Yi) this.A02).A05.A01((AnonymousClass206) this.A03, i6, true);
                return;
            case 7:
                ((C33251iW) this.A02).A0d((AnonymousClass206) this.A03, this.A01, true, false);
                return;
            case 8:
                MediaGalleryFragmentBase mediaGalleryFragmentBase = (MediaGalleryFragmentBase) this.A02;
                boolean z6 = this.A04;
                int i7 = this.A01;
                AnonymousClass87B r5 = (AnonymousClass87B) this.A03;
                MediaGalleryFragmentViewModel mediaGalleryFragmentViewModel = (MediaGalleryFragmentViewModel) mediaGalleryFragmentBase.A0i.getValue();
                List list2 = mediaGalleryFragmentBase.A0b;
                AnonymousClass858 r6 = mediaGalleryFragmentBase.A0a;
                Context A14 = mediaGalleryFragmentBase.A14();
                C18000vb r0 = mediaGalleryFragmentBase.A0E;
                if (r0 != null) {
                    C144347Gy r4 = new C144347Gy(A14, r0);
                    C18070vi.A0g(r6, 1, list2);
                    AnonymousClass3Ma.A1R(mediaGalleryFragmentViewModel.A03);
                    AnonymousClass1OX A004 = C41561wd.A00(mediaGalleryFragmentViewModel);
                    mediaGalleryFragmentViewModel.A03 = C30451dy.A02(AnonymousClass00R.A00, mediaGalleryFragmentViewModel.A08, new MediaGalleryFragmentViewModel$loadSections$1(r4, r5, r6, mediaGalleryFragmentViewModel, list2, (C30391dr) null, i7, z6), A004);
                    return;
                }
                AnonymousClass3MW.A1M();
                throw null;
            case 9:
                C32431hB.A05((C32431hB) this.A02, (AnonymousClass21V) this.A03, this.A01, this.A04, true);
                return;
            default:
                boolean z7 = this.A04;
                Object obj = this.A03;
                int i8 = this.A01;
                AnonymousClass2LK r2 = ((C1193467t) this.A02).A05;
                if (z7) {
                    r1 = new AnonymousClass7KT(obj, i8, 1);
                } else {
                    r1 = new AnonymousClass7KX(34);
                }
                r2.notifyAllObservers(r1);
                return;
        }
    }

    public AnonymousClass7RR(C1193467t r2, C122606Ra r3, int i, boolean z) {
        this.A00 = 10;
        this.A04 = z;
        this.A02 = r2;
        this.A03 = r3;
        this.A01 = i;
    }

    public AnonymousClass7RR(ConversationListView conversationListView, AnonymousClass206 r4) {
        this.A00 = 4;
        this.A02 = conversationListView;
        this.A03 = r4;
        this.A01 = -1;
        this.A04 = true;
    }

    public AnonymousClass7RR(Object obj, Object obj2, int i, int i2, boolean z) {
        this.A00 = i2;
        this.A02 = obj;
        this.A03 = obj2;
        this.A04 = z;
        this.A01 = i;
    }

    public AnonymousClass7RR(C88104Yi r2, AnonymousClass206 r3, int i) {
        this.A00 = 6;
        this.A02 = r2;
        this.A04 = true;
        this.A03 = r3;
        this.A01 = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass7RR(C20359AHp aHp, AnonymousClass9UL r8) {
        this(aHp, r8, -512, 0, true);
        this.A00 = 0;
        C18070vi.A0d(aHp, 1);
    }
}
