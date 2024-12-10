package com.whatsapp.community;

import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass1BI;
import X.AnonymousClass1CJ;
import X.AnonymousClass1DF;
import X.AnonymousClass1M9;
import X.AnonymousClass1MZ;
import X.AnonymousClass1NN;
import X.AnonymousClass1Q1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3Uc;
import X.AnonymousClass5RF;
import X.AnonymousClass5RG;
import X.AnonymousClass5RH;
import X.AnonymousClass86E;
import X.C101865Eg;
import X.C103985Mk;
import X.C18070vi;
import X.C18100vl;
import X.C22621Co;
import X.C24291Jp;
import X.C24671Lf;
import X.C24921Me;
import X.C25191Ng;
import X.C25231Nk;
import X.C27201Vd;
import X.C30361do;
import X.C35751mk;
import X.C37451pZ;
import X.C37961qT;
import X.C39511tC;
import X.C40251uP;
import X.C40261uQ;
import X.C40341uY;
import X.C40401ue;
import X.C40631v1;
import X.C43421zm;
import X.C72453Mb;
import X.C84284Iw;
import X.C89894dC;
import X.C95444mF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.wds.components.button.WDSButton;

public final class CommunityNewSubgroupSwitcherBottomSheet extends Hilt_CommunityNewSubgroupSwitcherBottomSheet implements AnonymousClass86E {
    public C84284Iw A00;
    public C40261uQ A01;
    public C40251uP A02;
    public C40401ue A03;
    public AnonymousClass1M9 A04;
    public C24671Lf A05;
    public C24921Me A06;
    public C37451pZ A07;
    public C37451pZ A08;
    public C27201Vd A09;
    public C40631v1 A0A;
    public C22621Co A0B;
    public AnonymousClass1CJ A0C;
    public AnonymousClass1NN A0D;
    public AnonymousClass1MZ A0E;
    public AnonymousClass00H A0F;
    public AnonymousClass00H A0G;
    public AnonymousClass00H A0H;
    public AnonymousClass00H A0I;
    public AnonymousClass00H A0J;
    public AnonymousClass00H A0K;
    public AnonymousClass00H A0L;
    public AnonymousClass00H A0M;
    public final C18100vl A0N = AnonymousClass1DF.A01(new C101865Eg(this));
    public final C18100vl A0O = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new C103985Mk(this));
    public final C25231Nk A0P = new C95444mF(this, 7);

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return layoutInflater.inflate(2131624598, viewGroup, false);
    }

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        C27201Vd r2 = this.A09;
        if (r2 != null) {
            this.A07 = r2.A06(A14(), "community-new-subgroup-switcher");
            C27201Vd r3 = this.A09;
            if (r3 != null) {
                this.A08 = r3.A08("community-new-subgroup-switcher-multi-contact", 0.0f, AnonymousClass3MZ.A09(this).getDimensionPixelSize(2131166074));
                AnonymousClass1NN r1 = this.A0D;
                if (r1 != null) {
                    r1.registerObserver(this.A0P);
                    TextEmojiLabel A0c = C72453Mb.A0c(view, 2131429253);
                    C43421zm.A04(A0c);
                    C89894dC.A00(C18070vi.A05(view, 2131435872), this, 14);
                    RecyclerView recyclerView = (RecyclerView) C18070vi.A05(view, 2131435873);
                    AnonymousClass3Ma.A15(A14(), recyclerView);
                    recyclerView.setItemAnimator((C37961qT) null);
                    C40251uP r22 = this.A02;
                    if (r22 != null) {
                        C40341uY A002 = r22.A00(A14());
                        C40261uQ r5 = this.A01;
                        if (r5 != null) {
                            C37451pZ r4 = this.A07;
                            if (r4 == null) {
                                C18070vi.A11("contactPhotoLoader");
                                throw null;
                            }
                            C37451pZ r23 = this.A08;
                            if (r23 == null) {
                                C18070vi.A11("multiContactPhotoLoader");
                                throw null;
                            }
                            C40401ue A003 = r5.A00(r4, r23, A002, 5);
                            this.A03 = A003;
                            recyclerView.setAdapter(A003);
                            AnonymousClass00H r0 = this.A0G;
                            if (r0 != null) {
                                AnonymousClass1Q1 r9 = (AnonymousClass1Q1) r0.get();
                                C40401ue r7 = this.A03;
                                if (r7 == null) {
                                    C18070vi.A11("subgroupAdapter");
                                    throw null;
                                }
                                C24671Lf r8 = this.A05;
                                if (r8 != null) {
                                    AnonymousClass00H r02 = this.A0H;
                                    if (r02 != null) {
                                        C35751mk r6 = (C35751mk) r02.get();
                                        AnonymousClass1NN r10 = this.A0D;
                                        if (r10 != null) {
                                            AnonymousClass00H r03 = this.A0F;
                                            if (r03 != null) {
                                                C39511tC r52 = (C39511tC) r03.get();
                                                AnonymousClass00H r04 = this.A0K;
                                                if (r04 != null) {
                                                    C40631v1 r42 = new C40631v1(r52, r6, r7, r8, r9, r10, (C25191Ng) r04.get());
                                                    this.A0A = r42;
                                                    r42.A00();
                                                    WDSButton wDSButton = (WDSButton) C18070vi.A05(view, 2131427601);
                                                    wDSButton.setIcon((Drawable) C24291Jp.A00(A1D().getTheme(), AnonymousClass3MZ.A09(this), 2131233191));
                                                    C89894dC.A00(wDSButton, this, 15);
                                                    C18100vl r43 = this.A0N;
                                                    AnonymousClass3MY.A1K(this, ((AnonymousClass3Uc) r43.getValue()).A0v, new AnonymousClass5RH(wDSButton), 32);
                                                    AnonymousClass3MY.A1K(this, ((AnonymousClass3Uc) r43.getValue()).A0D, new AnonymousClass5RF(A0c), 32);
                                                    AnonymousClass3MY.A1K(this, ((AnonymousClass3Uc) r43.getValue()).A0z, new AnonymousClass5RG(this), 32);
                                                    AnonymousClass3MY.A1K(this, ((AnonymousClass3Uc) r43.getValue()).A12, AnonymousClass3MW.A16(this, 12), 32);
                                                    return;
                                                }
                                                C18070vi.A11("groupParticipantsObservers");
                                                throw null;
                                            }
                                            C18070vi.A11("businessProfileObservers");
                                            throw null;
                                        }
                                        C18070vi.A11("conversationObservers");
                                        throw null;
                                    }
                                    C18070vi.A11("chatStateObservers");
                                    throw null;
                                }
                                C18070vi.A11("contactObservers");
                                throw null;
                            }
                            C18070vi.A11("chatObservers");
                            throw null;
                        }
                        C18070vi.A11("subgroupAdapterFactory");
                        throw null;
                    }
                    C18070vi.A11("conversationsListInterfaceImplFactory");
                    throw null;
                }
                C18070vi.A11("conversationObservers");
                throw null;
            }
        }
        C18070vi.A11("contactPhotos");
        throw null;
    }

    public void A1j() {
        String str;
        super.A1j();
        C37451pZ r0 = this.A07;
        if (r0 == null) {
            str = "contactPhotoLoader";
        } else {
            r0.A02();
            C37451pZ r02 = this.A08;
            if (r02 == null) {
                str = "multiContactPhotoLoader";
            } else {
                r02.A02();
                AnonymousClass1NN r1 = this.A0D;
                if (r1 != null) {
                    r1.unregisterObserver(this.A0P);
                    C40631v1 r03 = this.A0A;
                    if (r03 == null) {
                        str = "conversationListUpdateObservers";
                    } else {
                        r03.A01();
                        return;
                    }
                } else {
                    str = "conversationObservers";
                }
            }
        }
        C18070vi.A11(str);
        throw null;
    }

    public void A1v() {
        super.A1v();
        AnonymousClass00H r0 = this.A0L;
        if (r0 != null) {
            C18100vl r02 = C30361do.A0C;
            ((C30361do) C18070vi.A0E(r0)).A02((AnonymousClass1BI) null, 10);
            return;
        }
        C18070vi.A11("navigationTimeSpentManager");
        throw null;
    }
}
