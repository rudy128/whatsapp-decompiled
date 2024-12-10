package com.whatsapp.reactions;

import X.A7Y;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass10I;
import X.AnonymousClass11S;
import X.AnonymousClass1BI;
import X.AnonymousClass1CJ;
import X.AnonymousClass1EC;
import X.AnonymousClass1FL;
import X.AnonymousClass1GP;
import X.AnonymousClass1HF;
import X.AnonymousClass1KB;
import X.AnonymousClass1L9;
import X.AnonymousClass1LU;
import X.AnonymousClass1M9;
import X.AnonymousClass1MZ;
import X.AnonymousClass1Q8;
import X.AnonymousClass1VW;
import X.AnonymousClass1W6;
import X.AnonymousClass206;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass4MO;
import X.AnonymousClass5U3;
import X.AnonymousClass7AS;
import X.AnonymousClass7BQ;
import X.AnonymousClass82X;
import X.AnonymousClass82Y;
import X.AnonymousClass82Z;
import X.AnonymousClass86E;
import X.AnonymousClass8B5;
import X.AnonymousClass8BG;
import X.C110595gJ;
import X.C111215j4;
import X.C114585rI;
import X.C133866pd;
import X.C136836uU;
import X.C142607Ac;
import X.C142747Aq;
import X.C142767As;
import X.C1584680u;
import X.C1590382z;
import X.C18000vb;
import X.C18030ve;
import X.C18070vi;
import X.C191569mo;
import X.C200710s;
import X.C21449AkG;
import X.C22971Dz;
import X.C24071It;
import X.C24921Me;
import X.C27191Vc;
import X.C32021gV;
import X.C33251iW;
import X.C34001jj;
import X.C41111vp;
import X.C42941yz;
import X.C56882iB;
import X.C70863Cu;
import X.C72453Mb;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.WaTabLayout;
import com.whatsapp.WaViewPager;

public final class ReactionsBottomSheetDialogFragment extends Hilt_ReactionsBottomSheetDialogFragment implements AnonymousClass86E {
    public AnonymousClass1L9 A00;
    public AnonymousClass1KB A01;
    public AnonymousClass11S A02;
    public C33251iW A03;
    public WaTabLayout A04;
    public AnonymousClass8BG A05;
    public AnonymousClass1VW A06;
    public AnonymousClass1M9 A07;
    public C24921Me A08;
    public C27191Vc A09;
    public AnonymousClass4MO A0A;
    public C18000vb A0B;
    public AnonymousClass1Q8 A0C;
    public AnonymousClass1CJ A0D;
    public AnonymousClass1MZ A0E;
    public C56882iB A0F;
    public C18030ve A0G;
    public AnonymousClass1LU A0H;
    public AnonymousClass1BI A0I;
    public AnonymousClass206 A0J;
    public C191569mo A0K;
    public C32021gV A0L;
    public AnonymousClass10I A0M;
    public AnonymousClass00H A0N;
    public AnonymousClass00H A0O;
    public boolean A0P;
    public boolean A0Q;
    public WaViewPager A0R;
    public C114585rI A0S;
    public C200710s A0T;
    public final AnonymousClass8B5 A0U = new AnonymousClass7BQ(this, 1);

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return AnonymousClass3MX.A0A(layoutInflater, viewGroup, 2131626675);
    }

    public void A21(Bundle bundle, View view) {
        AnonymousClass1GP supportFragmentManager;
        View view2 = view;
        C18070vi.A0d(view2, 0);
        super.A21(bundle, view2);
        if (!this.A0P) {
            AnonymousClass1FL A1B = A1B();
            if (A1B != null && (supportFragmentManager = A1B.getSupportFragmentManager()) != null) {
                C34001jj r0 = new C34001jj(supportFragmentManager);
                r0.A07(this);
                r0.A01();
                return;
            }
            return;
        }
        boolean A2L = A2L();
        AnonymousClass1HF.A06(view2, 2131434342).setVisibility(C72453Mb.A01(A2L ? 1 : 0));
        if (A2L) {
            view2.setBackground((Drawable) null);
        } else {
            Window window = A26().getWindow();
            if (window != null) {
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.dimAmount = 0.3f;
                window.setAttributes(attributes);
            }
        }
        AnonymousClass1BI r11 = this.A0I;
        if (r11 == null) {
            C18070vi.A11("chatJid");
            throw null;
        }
        AnonymousClass10I r15 = this.A0M;
        if (r15 != null) {
            boolean z = this.A0Q;
            AnonymousClass1CJ r10 = this.A0D;
            if (r10 != null) {
                AnonymousClass00H r02 = this.A0O;
                if (r02 != null) {
                    AnonymousClass1W6 r13 = (AnonymousClass1W6) C18070vi.A0E(r02);
                    AnonymousClass8BG r9 = this.A05;
                    if (r9 == null) {
                        C18070vi.A11("messageReactions");
                        throw null;
                    }
                    C32021gV r14 = this.A0L;
                    if (r14 != null) {
                        C191569mo r12 = this.A0K;
                        if (r12 != null) {
                            C33251iW r8 = this.A03;
                            if (r8 != null) {
                                C111215j4 r122 = (C111215j4) new C24071It(new C142607Ac(r8, r9, r10, r11, r12, r13, r14, r15, z), this).A00(C111215j4.class);
                                WaTabLayout waTabLayout = (WaTabLayout) AnonymousClass3MX.A0C(view2, 2131434356);
                                this.A04 = waTabLayout;
                                WaViewPager waViewPager = (WaViewPager) AnonymousClass3MX.A0C(view2, 2131434358);
                                this.A0R = waViewPager;
                                AnonymousClass10I r03 = this.A0M;
                                if (r03 != null) {
                                    C200710s r92 = new C200710s(r03, false);
                                    this.A0T = r92;
                                    C18030ve r142 = this.A0G;
                                    if (r142 != null) {
                                        AnonymousClass1KB r132 = this.A01;
                                        if (r132 != null) {
                                            AnonymousClass11S r82 = this.A02;
                                            if (r82 != null) {
                                                AnonymousClass1VW r7 = this.A06;
                                                if (r7 != null) {
                                                    AnonymousClass1M9 r5 = this.A07;
                                                    if (r5 != null) {
                                                        C24921Me r4 = this.A08;
                                                        if (r4 != null) {
                                                            C18000vb r1 = this.A0B;
                                                            if (r1 != null) {
                                                                C27191Vc r04 = this.A09;
                                                                if (r04 != null) {
                                                                    C24921Me r22 = r4;
                                                                    C27191Vc r23 = r04;
                                                                    AnonymousClass1VW r20 = r7;
                                                                    AnonymousClass1M9 r21 = r5;
                                                                    AnonymousClass1KB r18 = r132;
                                                                    AnonymousClass11S r19 = r82;
                                                                    C114585rI r152 = new C114585rI(A14(), A1G(), r18, r19, r20, r21, r22, r23, r1, r142, r122, r92);
                                                                    this.A0S = r152;
                                                                    waViewPager.setAdapter(r152);
                                                                    waViewPager.A0L(new C142767As(1), false);
                                                                    waViewPager.A0K(new C142747Aq(waTabLayout));
                                                                    waTabLayout.post(new C21449AkG((Object) this, 1));
                                                                    C41111vp r72 = r122.A06;
                                                                    AnonymousClass7AS.A00(A1G(), r72, new AnonymousClass82Y(this, r122), 10);
                                                                    LayoutInflater from = LayoutInflater.from(A1n());
                                                                    AnonymousClass7AS.A00(A1G(), r122.A04.A02, new AnonymousClass82X(from, this), 10);
                                                                    for (C133866pd r42 : AnonymousClass3MW.A10(r72)) {
                                                                        AnonymousClass7AS.A00(A1G(), r42.A02, new C1590382z(from, this, r42), 10);
                                                                    }
                                                                    AnonymousClass7AS.A00(A1G(), r72, new AnonymousClass82Z(waViewPager, this), 10);
                                                                    AnonymousClass7AS.A00(A1G(), r122.A07, new AnonymousClass5U3(this), 10);
                                                                    AnonymousClass7AS.A00(A1G(), r122.A08, new C1584680u(this), 10);
                                                                    AnonymousClass1BI r16 = this.A0I;
                                                                    String str = "chatJid";
                                                                    if (r16 != null) {
                                                                        if (C22971Dz.A0e(r16)) {
                                                                            C42941yz r05 = AnonymousClass1EC.A01;
                                                                            AnonymousClass1EC A002 = C42941yz.A00(r16);
                                                                            if (A002 != null) {
                                                                                AnonymousClass1CJ r06 = this.A0D;
                                                                                if (r06 == null) {
                                                                                    str = "chatsCache";
                                                                                } else if (r06.A06(A002) == 3) {
                                                                                    AnonymousClass10I r17 = this.A0M;
                                                                                    if (r17 != null) {
                                                                                        r17.CGF(new C70863Cu(A002, this));
                                                                                        return;
                                                                                    }
                                                                                    str = "waWorkers";
                                                                                } else {
                                                                                    return;
                                                                                }
                                                                            } else {
                                                                                return;
                                                                            }
                                                                        } else {
                                                                            return;
                                                                        }
                                                                    }
                                                                    C18070vi.A11(str);
                                                                    throw null;
                                                                }
                                                                C18070vi.A11("contactPhotosBitmapManager");
                                                                throw null;
                                                            }
                                                            AnonymousClass3MW.A1M();
                                                            throw null;
                                                        }
                                                        C18070vi.A11("waContactNames");
                                                        throw null;
                                                    }
                                                    C18070vi.A11("contactManager");
                                                    throw null;
                                                }
                                                C18070vi.A11("contactAvatars");
                                                throw null;
                                            }
                                            C18070vi.A11("meManager");
                                            throw null;
                                        }
                                        AnonymousClass3MW.A1C();
                                        throw null;
                                    }
                                    AnonymousClass3MW.A1A();
                                    throw null;
                                }
                                AnonymousClass3MW.A1G();
                                throw null;
                            }
                            C18070vi.A11("userActionsDelegate");
                            throw null;
                        }
                        C18070vi.A11("reactionUserJourney");
                        throw null;
                    }
                    C18070vi.A11("messageThumbCache");
                    throw null;
                }
                C18070vi.A11("fMessageDatabase");
                throw null;
            }
            C18070vi.A11("chatsCache");
            throw null;
        }
        AnonymousClass3MW.A1G();
        throw null;
    }

    public void A2K(View view) {
        C18070vi.A0d(view, 0);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = AnonymousClass3MZ.A09(this).getDimensionPixelSize(2131168433);
        view.setLayoutParams(layoutParams);
        BottomSheetBehavior A022 = BottomSheetBehavior.A02(view);
        A022.A0V(layoutParams.height);
        A022.A0W(3);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C18070vi.A0d(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        AnonymousClass206 r3 = this.A0J;
        Integer num = AnonymousClass00R.A02;
        if (r3 != null) {
            C191569mo r0 = this.A0K;
            if (r0 != null) {
                r0.A00(r3, num, 1);
            } else {
                C18070vi.A11("reactionUserJourney");
                throw null;
            }
        }
    }

    public static final void A00(View view, ReactionsBottomSheetDialogFragment reactionsBottomSheetDialogFragment, int i) {
        WaTabLayout waTabLayout = reactionsBottomSheetDialogFragment.A04;
        if (waTabLayout != null) {
            C136836uU A0K2 = waTabLayout.A0K(i);
            if (A0K2 != null) {
                A0K2.A01 = null;
                C110595gJ r0 = A0K2.A02;
                if (r0 != null) {
                    r0.A04();
                }
                A0K2.A01 = view;
                C110595gJ r02 = A0K2.A02;
                if (r02 != null) {
                    r02.A04();
                    return;
                }
                return;
            }
            C136836uU A072 = waTabLayout.A07();
            A072.A01 = view;
            C110595gJ r03 = A072.A02;
            if (r03 != null) {
                r03.A04();
            }
            waTabLayout.A0H(A072, WaTabLayout.A00(waTabLayout, i, true), waTabLayout.A0h.isEmpty());
        }
    }

    public static final void A01(C136836uU r4, ReactionsBottomSheetDialogFragment reactionsBottomSheetDialogFragment) {
        int i;
        WaViewPager waViewPager = reactionsBottomSheetDialogFragment.A0R;
        if (waViewPager != null) {
            C114585rI r0 = reactionsBottomSheetDialogFragment.A0S;
            int i2 = 0;
            if (r0 != null) {
                i = r0.A0E();
            } else {
                i = 0;
            }
            int i3 = r4.A00;
            if (i3 < i) {
                i2 = waViewPager.A0O(i3);
            }
            waViewPager.A0P(i2);
        }
    }

    public void A1s() {
        super.A1s();
        this.A04 = null;
        this.A0R = null;
    }

    public Dialog A27(Bundle bundle) {
        Dialog A27 = super.A27(bundle);
        Window window = A27.getWindow();
        if (window != null) {
            window.setFlags(A7Y.A0F, A7Y.A0F);
        }
        return A27;
    }
}
