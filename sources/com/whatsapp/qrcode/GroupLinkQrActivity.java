package com.whatsapp.qrcode;

import X.AFD;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00R;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass10I;
import X.AnonymousClass11C;
import X.AnonymousClass11S;
import X.AnonymousClass126;
import X.AnonymousClass1BI;
import X.AnonymousClass1CJ;
import X.AnonymousClass1E7;
import X.AnonymousClass1EC;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1K1;
import X.AnonymousClass1KB;
import X.AnonymousClass1M9;
import X.AnonymousClass1PU;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass46J;
import X.AnonymousClass46K;
import X.AnonymousClass49K;
import X.AnonymousClass49S;
import X.AnonymousClass4FZ;
import X.AnonymousClass4NW;
import X.AnonymousClass4aX;
import X.AnonymousClass5YZ;
import X.AnonymousClass74D;
import X.C107515Zz;
import X.C1408473h;
import X.C17880vN;
import X.C17890vO;
import X.C17900vP;
import X.C17960vV;
import X.C18000vb;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C192109no;
import X.C218617r;
import X.C22911Dt;
import X.C24921Me;
import X.C29681ch;
import X.C29691ci;
import X.C30361do;
import X.C46162Dk;
import X.C72453Mb;
import X.C72473Md;
import X.C72483Me;
import X.C820341t;
import X.C83834Gv;
import X.C84064Hs;
import X.C85894Pd;
import X.C91024f1;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.jid.Jid;
import com.whatsapp.qrcode.contactqr.ContactQrContactCardView;

public final class GroupLinkQrActivity extends AnonymousClass1FY implements AnonymousClass5YZ, C107515Zz {
    public C85894Pd A00;
    public AnonymousClass1M9 A01;
    public C24921Me A02;
    public AnonymousClass1CJ A03;
    public AnonymousClass126 A04;
    public AnonymousClass74D A05;
    public AnonymousClass4NW A06;
    public C30361do A07;
    public AnonymousClass1PU A08;
    public C192109no A09;
    public ContactQrContactCardView A0A;
    public String A0B;
    public boolean A0C;

    public GroupLinkQrActivity() {
        this(0);
    }

    public void CG6() {
        A0c(true);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C18070vi.A0d(menu, 0);
        MenuItem icon = menu.add(0, 2131432543, 0, 2131888842).setIcon(AnonymousClass4aX.A05(this, AnonymousClass3MX.A06(this, 2131232294), 2131102547));
        C18070vi.A0X(icon);
        icon.setShowAsAction(2);
        AnonymousClass4NW r0 = this.A06;
        if (r0 == null) {
            C18070vi.A11("sharingEntity");
            throw null;
        } else if (!r0.A02) {
            return true;
        } else {
            menu.add(0, 2131432542, 0, 2131888831);
            return true;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        AnonymousClass46K r1;
        AnonymousClass46J r12;
        MenuItem menuItem2 = menuItem;
        String str = "sharingEntity";
        if (AnonymousClass3MY.A01(menuItem2, 0) == 2131432543) {
            String str2 = this.A0B;
            if (str2 == null) {
                A0c(false);
                this.A05.A08(2131896086, 0);
            } else {
                AnonymousClass4NW r13 = this.A06;
                if (r13 != null) {
                    if ((r13 instanceof AnonymousClass46J) && (r12 = (AnonymousClass46J) r13) != null) {
                        AnonymousClass74D r5 = this.A05;
                        if (r5 != null) {
                            r5.A0D(r12.A00, AnonymousClass00R.A0J, 3, 6);
                        } else {
                            str = "newsletterLogging";
                        }
                    }
                    CNA(2131888852);
                    StringBuilder A10 = AnonymousClass000.A10();
                    AnonymousClass4NW r0 = this.A06;
                    if (r0 != null) {
                        String A1H = AnonymousClass001.A1H(r0.A01, str2, A10);
                        boolean A052 = C18020vd.A05(C18040vf.A02, this.A0E, 8389);
                        AnonymousClass10I r3 = this.A05;
                        if (A052) {
                            AnonymousClass1KB r10 = this.A05;
                            AnonymousClass11S r11 = this.A02;
                            C218617r r9 = this.A04;
                            AnonymousClass4NW r02 = this.A06;
                            if (r02 != null) {
                                String A0Q = A0Q(r02, A1H, str2);
                                AnonymousClass4NW r03 = this.A06;
                                if (r03 != null) {
                                    AnonymousClass3MW.A1T(new AnonymousClass49S(this, r9, r10, r11, A0Q, A1H, A03(r03), true), r3, 0);
                                    return true;
                                }
                            }
                        } else {
                            AnonymousClass1KB r52 = this.A05;
                            AnonymousClass11S r2 = this.A02;
                            C218617r r14 = this.A04;
                            AnonymousClass4NW r04 = this.A06;
                            if (r04 != null) {
                                AnonymousClass49K r16 = new AnonymousClass49K(this, r14, r52, r2, A0Q(r04, A1H, str2));
                                Bitmap[] bitmapArr = new Bitmap[1];
                                AnonymousClass4NW r05 = this.A06;
                                if (r05 != null) {
                                    AnonymousClass1E7 r22 = r05.A00;
                                    String A032 = A03(r05);
                                    C18070vi.A0d(A1H, 3);
                                    bitmapArr[0] = C1408473h.A01(this, r22, A1H, A032, true);
                                    r3.CGD(r16, bitmapArr);
                                    return true;
                                }
                            }
                        }
                    }
                }
                C18070vi.A11(str);
                throw null;
            }
        } else if (menuItem2.getItemId() != 2131432542) {
            return super.onOptionsItemSelected(menuItem2);
        } else {
            AnonymousClass4NW r15 = this.A06;
            if (r15 != null) {
                if ((r15 instanceof AnonymousClass46K) && (r1 = (AnonymousClass46K) r15) != null) {
                    CMl(AnonymousClass4FZ.A00(r1.A00, true));
                    return true;
                }
            }
            C18070vi.A11(str);
            throw null;
        }
        return true;
    }

    private final String A03(AnonymousClass4NW r3) {
        int i;
        if (r3 instanceof AnonymousClass46K) {
            i = 2131891033;
            if (((AnonymousClass46K) r3).A01) {
                i = 2131893514;
            }
        } else if (r3 instanceof AnonymousClass46J) {
            i = 2131888108;
        } else {
            throw AnonymousClass3MW.A14();
        }
        return C18070vi.A0F(this, i);
    }

    private final String A0Q(AnonymousClass4NW r7, String str, String str2) {
        if (r7 instanceof AnonymousClass46K) {
            int i = 2131891132;
            if (((AnonymousClass46K) r7).A01) {
                i = 2131893521;
            }
            String A0R = C17890vO.A0R(this, str, 1, 0, i);
            C18070vi.A0b(A0R);
            return A0R;
        } else if (r7 instanceof AnonymousClass46J) {
            Object[] A1b = AnonymousClass3MW.A1b();
            C24921Me r1 = this.A02;
            if (r1 != null) {
                AnonymousClass3MX.A1N(r1, r7.A00, A1b, 0);
                return AnonymousClass3Ma.A10(this, str2, A1b, 1, 2131892898);
            }
            C18070vi.A11("waContactNames");
            throw null;
        } else {
            throw AnonymousClass3MW.A14();
        }
    }

    private final void A0V(String str) {
        ContactQrContactCardView contactQrContactCardView = this.A0A;
        if (contactQrContactCardView != null) {
            StringBuilder A10 = AnonymousClass000.A10();
            AnonymousClass4NW r0 = this.A06;
            if (r0 == null) {
                C18070vi.A11("sharingEntity");
                throw null;
            }
            contactQrContactCardView.setQrCode(AnonymousClass001.A1H(r0.A01, str, A10));
            ContactQrContactCardView contactQrContactCardView2 = this.A0A;
            if (contactQrContactCardView2 != null) {
                contactQrContactCardView2.setQrCodeContentDescription(getString(2131888847));
                return;
            }
        }
        C18070vi.A11("contactQrContactCardView");
        throw null;
    }

    private final void A0c(boolean z) {
        AnonymousClass46K r1;
        String str;
        AnonymousClass4NW r12 = this.A06;
        if (r12 == null) {
            str = "sharingEntity";
        } else if ((r12 instanceof AnonymousClass46K) && (r1 = (AnonymousClass46K) r12) != null) {
            AnonymousClass1EC r2 = r1.A00;
            if (z) {
                CNB(0, 2131888852);
            }
            C85894Pd r0 = this.A00;
            if (r0 != null) {
                C820341t A002 = r0.A00(this, z);
                C17960vV.A07(r2);
                A002.A06(r2);
                return;
            }
            str = "getInviteLinkProtocolHelperFactory";
        } else {
            return;
        }
        C18070vi.A11(str);
        throw null;
    }

    public void A2y() {
        if (!this.A0C) {
            this.A0C = true;
            AnonymousClass1K1 A0K = C72473Md.A0K(this);
            AnonymousClass10E r2 = A0K.AAQ;
            C72483Me.A0q(r2, this);
            AnonymousClass10G r1 = r2.A00;
            AnonymousClass1FB.A0K(r2, r1, this, r1.A45);
            AnonymousClass1FB.A0L(r2, r1, this, r1.A5A);
            this.A03 = AnonymousClass3Ma.A0d(r2);
            this.A01 = AnonymousClass10E.A4z(r2);
            this.A00 = (C85894Pd) A0K.A3P.get();
            this.A04 = AnonymousClass3MY.A0X(r2);
            this.A08 = AnonymousClass3MZ.A12(r2);
            this.A07 = (C30361do) r2.A74.get();
            this.A05 = (AnonymousClass74D) r2.A7M.get();
            this.A02 = AnonymousClass3MZ.A0g(r2);
        }
    }

    public void A3K() {
        if (C18020vd.A05(C18040vf.A02, this.A0E, 12350)) {
            C30361do r3 = this.A07;
            if (r3 != null) {
                C18100vl r0 = C30361do.A0C;
                r3.A02((AnonymousClass1BI) null, 114);
                return;
            }
            C18070vi.A11("navigationTimeSpentManager");
            throw null;
        }
        super.A3K();
    }

    public void Bwi(int i, String str, boolean z) {
        AnonymousClass46K r2;
        String str2;
        AnonymousClass4NW r22 = this.A06;
        if (r22 == null) {
            str2 = "sharingEntity";
        } else if ((r22 instanceof AnonymousClass46K) && (r2 = (AnonymousClass46K) r22) != null) {
            CEx();
            StringBuilder A10 = AnonymousClass000.A10();
            if (str != null) {
                A10.append("inviteLink/gotCode/");
                A10.append(str);
                C17900vP.A0n(" recreate:", A10, z);
                AnonymousClass126 r0 = this.A04;
                if (r0 != null) {
                    r0.A1E.put(r2.A00, str);
                    this.A0B = str;
                    A0V(str);
                    if (z) {
                        BhQ(2131895302);
                        return;
                    }
                    return;
                }
            } else {
                C17900vP.A0j("inviteLink/failed/", A10, i);
                if (i == 436) {
                    CMl(C83834Gv.A00(true, true));
                    AnonymousClass126 r02 = this.A04;
                    if (r02 != null) {
                        r02.A1E.remove(r2.A00);
                        return;
                    }
                } else {
                    this.A05.A08(C84064Hs.A00(i, r2.A01), 0);
                    String str3 = this.A0B;
                    if (str3 == null || str3.length() == 0) {
                        finish();
                        return;
                    }
                    return;
                }
            }
            str2 = "groupChatManager";
        } else {
            return;
        }
        C18070vi.A11(str2);
        throw null;
    }

    public void onStop() {
        C192109no r1 = this.A09;
        if (r1 == null) {
            C18070vi.A11("brightnessController");
            throw null;
        }
        Window window = getWindow();
        C18070vi.A0X(window);
        r1.A00(window);
        super.onStop();
    }

    public void onCreate(Bundle bundle) {
        String str;
        AnonymousClass4NW r1;
        int i;
        C46162Dk r12;
        super.onCreate(bundle);
        setContentView(2131625523);
        Toolbar A0G = AnonymousClass3Ma.A0G(this);
        C18000vb r2 = this.A00;
        A0G.setNavigationIcon((Drawable) AnonymousClass4aX.A0A(this, A0G.getResources(), A0G.getResources().getDrawable(2131231675), r2));
        A0G.setTitle(2131888847);
        A0G.setNavigationOnClickListener(new AFD(this, 21));
        setSupportActionBar(A0G);
        setTitle(2131895996);
        C22911Dt r0 = Jid.Companion;
        Jid A002 = C22911Dt.A00(C72453Mb.A0u(this));
        if (A002 instanceof AnonymousClass1EC) {
            AnonymousClass1M9 r13 = this.A01;
            if (r13 != null) {
                AnonymousClass1E7 A0H = r13.A0H((AnonymousClass1BI) A002);
                AnonymousClass1EC r3 = (AnonymousClass1EC) A002;
                AnonymousClass1PU r02 = this.A08;
                if (r02 != null) {
                    r1 = new AnonymousClass46K(A0H, r3, r02.A03(r3));
                } else {
                    str = "groupChatUtils";
                    C18070vi.A11(str);
                    throw null;
                }
            }
            str = "contactManager";
            C18070vi.A11(str);
            throw null;
        } else if (A002 instanceof C29681ch) {
            AnonymousClass1M9 r14 = this.A01;
            if (r14 != null) {
                r1 = new AnonymousClass46J(r14.A0H((AnonymousClass1BI) A002), (C29681ch) A002);
            }
            str = "contactManager";
            C18070vi.A11(str);
            throw null;
        } else {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Unsupported jid type: ");
            throw AnonymousClass000.A0k(C17880vN.A0t(A10, A002.getType()));
        }
        this.A06 = r1;
        ContactQrContactCardView contactQrContactCardView = (ContactQrContactCardView) AnonymousClass3MY.A0H(this, 2131431289);
        this.A0A = contactQrContactCardView;
        if (contactQrContactCardView != null) {
            AnonymousClass4NW r03 = this.A06;
            String str2 = "sharingEntity";
            if (r03 != null) {
                contactQrContactCardView.A02(r03.A00, true);
                ContactQrContactCardView contactQrContactCardView2 = this.A0A;
                if (contactQrContactCardView2 != null) {
                    contactQrContactCardView2.setStyle(0);
                    ContactQrContactCardView contactQrContactCardView3 = this.A0A;
                    if (contactQrContactCardView3 != null) {
                        AnonymousClass4NW r15 = this.A06;
                        if (r15 != null) {
                            if (r15 instanceof AnonymousClass46K) {
                                i = 2131891032;
                                if (((AnonymousClass46K) r15).A01) {
                                    i = 2131893513;
                                }
                            } else if (r15 instanceof AnonymousClass46J) {
                                i = 2131888107;
                            } else {
                                throw AnonymousClass3MW.A14();
                            }
                            contactQrContactCardView3.setPrompt(C18070vi.A0F(this, i));
                            this.A09 = new C192109no();
                            AnonymousClass4NW r32 = this.A06;
                            String str3 = null;
                            if (r32 != null) {
                                if (r32 instanceof AnonymousClass46K) {
                                    AnonymousClass126 r04 = this.A04;
                                    if (r04 != null) {
                                        str3 = C17880vN.A0s(((AnonymousClass46K) r32).A00, r04.A1E);
                                    } else {
                                        str2 = "groupChatManager";
                                    }
                                } else if (r32 instanceof AnonymousClass46J) {
                                    AnonymousClass1CJ r16 = this.A03;
                                    if (r16 != null) {
                                        C29691ci A0A2 = r16.A0A(((AnonymousClass46J) r32).A00);
                                        if ((A0A2 instanceof C46162Dk) && (r12 = (C46162Dk) A0A2) != null) {
                                            str3 = r12.A0S;
                                        }
                                    } else {
                                        str2 = "chatsCache";
                                    }
                                } else {
                                    throw AnonymousClass3MW.A14();
                                }
                                this.A0B = str3;
                                if (str3 != null && str3.length() > 0) {
                                    A0V(str3);
                                }
                                A0c(false);
                                return;
                            }
                            C18070vi.A11(str2);
                            throw null;
                        }
                    }
                }
            }
            C18070vi.A11(str2);
            throw null;
        }
        C18070vi.A11("contactQrContactCardView");
        throw null;
    }

    public void onStart() {
        super.onStart();
        C192109no r2 = this.A09;
        if (r2 == null) {
            C18070vi.A11("brightnessController");
            throw null;
        }
        AnonymousClass11C r1 = this.A08;
        C18070vi.A0W(r1);
        Window window = getWindow();
        C18070vi.A0X(window);
        r2.A01(window, r1);
    }

    public GroupLinkQrActivity(int i) {
        this.A0C = false;
        C91024f1.A00(this, 43);
    }
}
