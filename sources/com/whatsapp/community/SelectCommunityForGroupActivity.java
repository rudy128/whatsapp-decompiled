package com.whatsapp.community;

import X.AnonymousClass000;
import X.AnonymousClass02n;
import X.AnonymousClass039;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1BI;
import X.AnonymousClass1CJ;
import X.AnonymousClass1E7;
import X.AnonymousClass1EC;
import X.AnonymousClass1FB;
import X.AnonymousClass1G4;
import X.AnonymousClass1K1;
import X.AnonymousClass1MZ;
import X.AnonymousClass1ZT;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3rC;
import X.AnonymousClass3rD;
import X.AnonymousClass483;
import X.AnonymousClass4FI;
import X.AnonymousClass4J3;
import X.AnonymousClass4SL;
import X.AnonymousClass4Y9;
import X.AnonymousClass5RN;
import X.AnonymousClass5RO;
import X.C003401n;
import X.C102005Eu;
import X.C102015Ev;
import X.C104015Mn;
import X.C106395Vr;
import X.C107965au;
import X.C17880vN;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C18460wS;
import X.C27354DcQ;
import X.C29261bv;
import X.C29431cG;
import X.C30391dr;
import X.C32111gf;
import X.C34511kb;
import X.C36321nh;
import X.C40371ub;
import X.C41561wd;
import X.C42941yz;
import X.C72473Md;
import X.C72483Me;
import X.C74803cp;
import X.C77073pJ;
import X.C77153pT;
import X.C77163pU;
import X.C77183pW;
import X.C77193pX;
import X.C77663r9;
import X.C86604Sh;
import X.C91004ez;
import X.C91074f6;
import X.C98974s1;
import X.C99274sY;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ImageView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.base.WaDialogFragment;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.jid.GroupJid;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public final class SelectCommunityForGroupActivity extends C77073pJ implements C107965au {
    public AnonymousClass02n A00;
    public C32111gf A01;
    public C40371ub A02;
    public AnonymousClass1CJ A03;
    public AnonymousClass1MZ A04;
    public boolean A05;
    public boolean A06;
    public final C18100vl A07;

    public SelectCommunityForGroupActivity() {
        this(0);
        this.A07 = C99274sY.A00(new C102015Ev(this), new C102005Eu(this), new C104015Mn(this), AnonymousClass3MW.A15(SelectCommunityForGroupViewModel.class));
    }

    public void A4z(AnonymousClass4SL r12, AnonymousClass1E7 r13) {
        C77663r9 r10;
        AnonymousClass1BI r0;
        int i;
        int i2;
        int i3;
        int i4;
        int A17 = C18070vi.A17(r12, r13);
        Object tag = r12.A01.getTag(2131432846);
        if (tag instanceof C77663r9) {
            r10 = (C77663r9) tag;
        } else {
            r10 = null;
        }
        C42941yz r02 = AnonymousClass1EC.A01;
        if (r10 != null) {
            r0 = r10.A00.A0J;
        } else {
            r0 = null;
        }
        AnonymousClass1EC A002 = C42941yz.A00(r0);
        boolean z = false;
        if (A002 != null) {
            C34511kb r1 = this.A01;
            if (r1 != null) {
                if ((C18020vd.A00(C18040vf.A02, r1.A07, 1238) + 1) - r1.A08.A03(A002).size() <= 0) {
                    z = true;
                }
            } else {
                C18070vi.A11("communityChatManager");
                throw null;
            }
        }
        if (z) {
            r12.A00(getString(2131888576), false, 2);
        } else {
            r12.A01(r13.A0y);
            if (r10 != null) {
                i = r10.A01;
                i2 = r10.A00;
            } else {
                i = 0;
                i2 = 0;
            }
            Resources resources = getResources();
            Object[] objArr = new Object[A17];
            if (r10 != null) {
                i3 = r10.A01;
            } else {
                i3 = 0;
            }
            C17880vN.A1T(objArr, i3, 0);
            String quantityString = resources.getQuantityString(2131755064, i, objArr);
            C18070vi.A0X(quantityString);
            Resources resources2 = getResources();
            Object[] objArr2 = new Object[A17];
            if (r10 != null) {
                i4 = r10.A00;
            } else {
                i4 = 0;
            }
            C17880vN.A1T(objArr2, i4, 0);
            String quantityString2 = resources2.getQuantityString(2131755186, i2, objArr2);
            C18070vi.A0X(quantityString2);
            TextEmojiLabel textEmojiLabel = r12.A03;
            textEmojiLabel.setVisibility(0);
            if (i == 0) {
                if (i2 == 0) {
                    textEmojiLabel.setVisibility(8);
                }
            } else if (i2 == 0) {
                textEmojiLabel.setText(quantityString);
            } else {
                Object[] objArr3 = new Object[2];
                objArr3[0] = quantityString;
                quantityString2 = C17880vN.A0q(this, quantityString2, objArr3, A17, 2131888577);
            }
            textEmojiLabel.setText(quantityString2);
        }
        ImageView imageView = r12.A02;
        C18070vi.A0z(imageView, "null cannot be cast to non-null type com.whatsapp.components.button.ThumbnailButton");
        ((ThumbnailButton) imageView).A01 = 0.0f;
    }

    public void A58(List list) {
        Object value;
        C18070vi.A0d(list, 0);
        super.A58(list);
        SelectCommunityForGroupViewModel selectCommunityForGroupViewModel = (SelectCommunityForGroupViewModel) this.A07.getValue();
        if (list.isEmpty()) {
            selectCommunityForGroupViewModel.A01.A05();
            AnonymousClass1G4 r4 = selectCommunityForGroupViewModel.A05;
            do {
                value = r4.getValue();
            } while (!r4.BFK(value, new C77183pW(((AnonymousClass4FI) value).A00(), new C86604Sh(AnonymousClass3MX.A0t(2131892913)))));
        }
    }

    public void A59(List list) {
        AnonymousClass3rC r0;
        C18070vi.A0d(list, 0);
        AnonymousClass3rC r5 = new AnonymousClass3rC(C18070vi.A0F(this, 2131888487), false);
        AnonymousClass3rC r3 = new AnonymousClass3rC(C18070vi.A0F(this, 2131888486), false);
        ArrayList A13 = AnonymousClass000.A13();
        for (Object next : list) {
            if (next instanceof C77663r9) {
                A13.add(next);
            }
        }
        LinkedHashMap A132 = C17880vN.A13();
        for (Object next2 : A13) {
            C36321nh r02 = GroupJid.Companion;
            GroupJid A002 = C36321nh.A00(((AnonymousClass3rD) next2).A00.A0J);
            if (A002 != null) {
                AnonymousClass1MZ r03 = this.A04;
                if (r03 != null) {
                    boolean A0K = r03.A0K(A002);
                    r0 = r3;
                    if (A0K) {
                        r0 = r5;
                    }
                } else {
                    C18070vi.A11("groupParticipantsManager");
                    throw null;
                }
            } else {
                r0 = null;
            }
            ((List) C72473Md.A0h(r0, A132)).add(next2);
        }
        C27354DcQ A012 = AnonymousClass1ZT.A01();
        List list2 = (List) A132.get(r5);
        if (list2 != null && AnonymousClass000.A1a(list2)) {
            A012.add(r5);
            A012.addAll(C98974s1.A00(list2, this, 6));
        }
        List list3 = (List) A132.get(r3);
        if (list3 != null && AnonymousClass000.A1a(list3)) {
            A012.add(r3);
            A012.addAll(C98974s1.A00(list3, this, 7));
        }
        super.A59(AnonymousClass1ZT.A02(A012));
    }

    public void BEb(AnonymousClass1E7 r3) {
        C18070vi.A0d(r3, 0);
        super.BEb(r3);
        List list = this.A0i;
        C18070vi.A0W(list);
        ((SelectCommunityForGroupViewModel) this.A07.getValue()).A0T((AnonymousClass1E7) C29431cG.A0c(list));
    }

    public void A2y() {
        if (!this.A06) {
            this.A06 = true;
            AnonymousClass1K1 A0K = C72473Md.A0K(this);
            AnonymousClass10E r2 = A0K.AAQ;
            C72483Me.A0q(r2, this);
            AnonymousClass10G r1 = r2.A00;
            AnonymousClass1FB.A0K(r2, r1, this, r1.A45);
            AnonymousClass1FB.A0L(r2, r1, this, r1.A5A);
            C74803cp.A0t(A0K, r2, r1, this, A0K.A63);
            C74803cp.A0s(A0K, r2, r1, this);
            this.A01 = AnonymousClass3MZ.A0b(r2);
            this.A02 = AnonymousClass10E.A46(r2);
            this.A00 = (AnonymousClass4J3) A0K.A1x.get();
            this.A03 = AnonymousClass3Ma.A0d(r2);
            this.A01 = (C32111gf) r2.A2M.get();
            this.A02 = (C40371ub) r2.A2P.get();
            this.A04 = AnonymousClass3MY.A0V(r2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        r1 = (X.C77193pX) r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BkF(java.lang.String r6) {
        /*
            r5 = this;
            X.0vl r0 = r5.A07
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.community.SelectCommunityForGroupViewModel r0 = (com.whatsapp.community.SelectCommunityForGroupViewModel) r0
            X.1G4 r4 = r0.A05
        L_0x000a:
            java.lang.Object r3 = r4.getValue()
            r2 = r3
            X.4FI r2 = (X.AnonymousClass4FI) r2
            boolean r0 = r2 instanceof X.C77193pX
            if (r0 == 0) goto L_0x0022
            r1 = r2
            X.3pX r1 = (X.C77193pX) r1
            X.1Di r0 = r1.A04
            if (r0 == 0) goto L_0x0022
            java.lang.Object r1 = r0.invoke(r1)
            if (r1 != 0) goto L_0x0034
        L_0x0022:
            X.4Y9 r0 = r2.A00()
            X.1EC r2 = r0.A00
            boolean r1 = r0.A01
            X.4Y9 r0 = new X.4Y9
            r0.<init>(r2, r1)
            X.3pT r1 = new X.3pT
            r1.<init>(r0)
        L_0x0034:
            boolean r0 = r4.BFK(r3, r1)
            if (r0 == 0) goto L_0x000a
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.SelectCommunityForGroupActivity.BkF(java.lang.String):void");
    }

    public void Bnj() {
        Object value;
        AnonymousClass4Y9 A002;
        boolean z;
        SelectCommunityForGroupViewModel selectCommunityForGroupViewModel = (SelectCommunityForGroupViewModel) this.A07.getValue();
        AnonymousClass1G4 r5 = selectCommunityForGroupViewModel.A05;
        do {
            value = r5.getValue();
            A002 = ((AnonymousClass4FI) value).A00();
            z = A002.A01;
            C40371ub r0 = selectCommunityForGroupViewModel.A01;
            if (z) {
                r0.A09(14);
            } else {
                r0.A08(14);
            }
        } while (!r5.BFK(value, new C77153pT(new AnonymousClass4Y9(A002.A00, z))));
    }

    public void Bpb() {
        Object value;
        Object A012;
        int i;
        List list;
        Object value2;
        SelectCommunityForGroupViewModel selectCommunityForGroupViewModel = (SelectCommunityForGroupViewModel) this.A07.getValue();
        AnonymousClass1EC A0p = AnonymousClass3MX.A0p(this.A03);
        boolean z = this.A05;
        C18070vi.A0d(A0p, 0);
        AnonymousClass1G4 r5 = selectCommunityForGroupViewModel.A05;
        boolean z2 = ((AnonymousClass4FI) r5.getValue()).A00().A01;
        C40371ub r1 = selectCommunityForGroupViewModel.A01;
        if (z2) {
            r1.A09(13);
        } else {
            r1.A08(13);
        }
        if (!selectCommunityForGroupViewModel.A02.A09()) {
            r1.A05();
            do {
                value2 = r5.getValue();
            } while (!r5.BFK(value2, ((AnonymousClass4FI) value2).A01(new C86604Sh(new AnonymousClass483(new Object[0])), 2131898766, C106395Vr.A00, new AnonymousClass5RO(selectCommunityForGroupViewModel))));
            return;
        }
        do {
            value = r5.getValue();
            AnonymousClass4FI r7 = (AnonymousClass4FI) value;
            AnonymousClass4Y9 A002 = r7.A00();
            AnonymousClass1EC r9 = A002.A00;
            if (r9 != null) {
                if (A002.A01) {
                    if (z) {
                        list = C18070vi.A0M(A0p.getRawString());
                    } else {
                        list = C18460wS.A00;
                    }
                    AnonymousClass3MW.A1X(selectCommunityForGroupViewModel.A04, new SelectCommunityForGroupViewModel$suggestGroup$1(selectCommunityForGroupViewModel, r9, A0p, list, (C30391dr) null), C41561wd.A00(selectCommunityForGroupViewModel));
                    i = 2131896618;
                } else {
                    AnonymousClass3MW.A1X(selectCommunityForGroupViewModel.A04, new SelectCommunityForGroupViewModel$linkGroup$1(selectCommunityForGroupViewModel, A0p, r9, (C30391dr) null, z), C41561wd.A00(selectCommunityForGroupViewModel));
                    i = 2131886532;
                }
                A012 = new C77163pU(A002, new C86604Sh(AnonymousClass3MX.A0t(i)));
            } else {
                A012 = r7.A01(new C86604Sh(AnonymousClass3MX.A0t(2131886154)), 2131898766, C106395Vr.A00, new AnonymousClass5RN(selectCommunityForGroupViewModel));
            }
        } while (!r5.BFK(value, A012));
    }

    public void CBt(String str) {
        Object value;
        Object r1;
        AnonymousClass1G4 r4 = ((SelectCommunityForGroupViewModel) this.A07.getValue()).A05;
        do {
            value = r4.getValue();
            AnonymousClass4FI r12 = (AnonymousClass4FI) value;
            if (r12 instanceof C77193pX) {
                C77193pX r13 = (C77193pX) r12;
                r1 = r13.A05.invoke(r13);
            } else {
                AnonymousClass4Y9 A002 = r12.A00();
                r1 = new C77153pT(new AnonymousClass4Y9(A002.A00, A002.A01));
            }
        } while (!r4.BFK(value, r1));
    }

    public static final void A0y(SelectCommunityForGroupActivity selectCommunityForGroupActivity) {
        DialogFragment dialogFragment;
        List<Fragment> A042 = selectCommunityForGroupActivity.getSupportFragmentManager().A0U.A04();
        C18070vi.A0X(A042);
        for (Fragment fragment : A042) {
            if ((fragment instanceof WaDialogFragment) && (dialogFragment = (DialogFragment) fragment) != null) {
                dialogFragment.A28();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, X.02h] */
    public void onCreate(Bundle bundle) {
        AnonymousClass1BI r0;
        super.onCreate(bundle);
        WaTextView waTextView = new WaTextView(this);
        waTextView.setText(2131886482);
        waTextView.setLines(1);
        waTextView.setGravity(17);
        waTextView.setMaxLines(1);
        C29261bv.A04(waTextView, 1);
        C003401n supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0F();
            supportActionBar.A0Q(waTextView, new AnonymousClass039(-1, -1));
            supportActionBar.A0W(true);
        }
        C18100vl r3 = this.A07;
        AnonymousClass1EC r1 = ((AnonymousClass4FI) ((SelectCommunityForGroupViewModel) r3.getValue()).A06.getValue()).A00().A00;
        List list = this.A0i;
        C18070vi.A0W(list);
        AnonymousClass1E7 r02 = (AnonymousClass1E7) C29431cG.A0c(list);
        if (r02 != null) {
            r0 = r02.A0J;
        } else {
            r0 = null;
        }
        if (!C18070vi.A18(r1, r0)) {
            ((SelectCommunityForGroupViewModel) r3.getValue()).A0T((AnonymousClass1E7) C29431cG.A0c(list));
        }
        this.A00 = C91074f6.A00(this, new Object(), 3);
        AnonymousClass3MX.A1Q(new SelectCommunityForGroupActivity$collectViewModelEvents$1(this, (C30391dr) null), AnonymousClass3MZ.A0H(this));
    }

    public SelectCommunityForGroupActivity(int i) {
        this.A06 = false;
        C91004ez.A00(this, 7);
    }
}
