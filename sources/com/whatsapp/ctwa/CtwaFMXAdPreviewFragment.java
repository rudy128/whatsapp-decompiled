package com.whatsapp.ctwa;

import X.AnonymousClass00H;
import X.AnonymousClass118;
import X.AnonymousClass1DF;
import X.AnonymousClass1L9;
import X.AnonymousClass1YD;
import X.AnonymousClass3MW;
import X.AnonymousClass4VT;
import X.AnonymousClass5HH;
import X.C138156wc;
import X.C17880vN;
import X.C18020vd;
import X.C18070vi;
import X.C18100vl;
import X.C20941Abv;
import X.C24261Jm;
import X.C72453Mb;
import X.C88654aI;
import X.C89924dF;
import X.C90014dO;
import X.C97994qO;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.button.WDSButton;
import org.json.JSONException;
import org.json.JSONObject;

public class CtwaFMXAdPreviewFragment extends Hilt_CtwaFMXAdPreviewFragment {
    public ViewStub A00;
    public LinearLayout A01;
    public AnonymousClass1L9 A02;
    public WaImageView A03;
    public WaImageView A04;
    public UserJid A05;
    public C20941Abv A06;
    public AnonymousClass00H A07;
    public AnonymousClass00H A08;
    public AnonymousClass00H A09;
    public AnonymousClass00H A0A;
    public AnonymousClass00H A0B;
    public AnonymousClass00H A0C;
    public AnonymousClass00H A0D;
    public AnonymousClass00H A0E;
    public String A0F;
    public boolean A0G;
    public View A0H;
    public View A0I;
    public ViewStub A0J;
    public WaTextView A0K;
    public WaTextView A0L;
    public final C18100vl A0M = AnonymousClass1DF.A01(new AnonymousClass5HH(this));

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        View inflate = layoutInflater.inflate(2131625040, viewGroup, false);
        this.A01 = (LinearLayout) inflate.findViewById(2131429516);
        this.A0L = AnonymousClass3MW.A0U(inflate, 2131436208);
        this.A04 = AnonymousClass3MW.A0S(inflate, 2131427561);
        this.A00 = AnonymousClass3MW.A0F(inflate, 2131427569);
        this.A0J = AnonymousClass3MW.A0F(inflate, 2131427566);
        this.A0H = inflate.findViewById(2131430073);
        this.A0K = AnonymousClass3MW.A0U(inflate, 2131427556);
        return inflate;
    }

    public void A21(Bundle bundle, View view) {
        String str;
        String str2;
        String str3;
        Long l;
        String str4;
        Context context;
        int i;
        String str5;
        WaImageView waImageView;
        Long l2;
        String str6;
        View inflate;
        String str7;
        String str8;
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        boolean z = this.A0G;
        String str9 = null;
        C20941Abv abv = this.A06;
        if (z) {
            if (!(abv == null || (str8 = abv.A0C) == null)) {
                AnonymousClass00H r0 = this.A08;
                if (r0 != null) {
                    AnonymousClass3MW.A0b(r0).A06(this.A05, str8);
                } else {
                    C18070vi.A11("ctwaCustomerLoggingController");
                    throw null;
                }
            }
            AnonymousClass00H r02 = this.A08;
            if (r02 != null) {
                C88654aI A0b = AnonymousClass3MW.A0b(r02);
                UserJid userJid = this.A05;
                C20941Abv abv2 = this.A06;
                if (abv2 != null) {
                    str7 = abv2.A03;
                } else {
                    str7 = null;
                }
                if (C18020vd.A04(A0b)) {
                    C88654aI.A02(A0b, userJid, str7, 47);
                }
            } else {
                C18070vi.A11("ctwaCustomerLoggingController");
                throw null;
            }
        } else {
            if (abv != null) {
                str = abv.A03;
            } else {
                str = null;
            }
            JSONObject A15 = C17880vN.A15();
            try {
                A15.put("agm_cta_type", str);
                str2 = A15.toString();
            } catch (JSONException unused) {
                Log.e("AutomatedGreetingMessageNativeFlowInfoConverter/toJSONAgmInfo: Invalid JSON");
                str2 = null;
            }
            this.A0F = str2;
            AnonymousClass00H r03 = this.A07;
            if (r03 != null) {
                C138156wc r5 = (C138156wc) r03.get();
                C20941Abv abv3 = this.A06;
                if (abv3 != null) {
                    str3 = abv3.A0C;
                } else {
                    str3 = null;
                }
                AnonymousClass00H r04 = this.A0A;
                if (r04 != null) {
                    String A0B2 = C17880vN.A0H(r04).A0B();
                    String str10 = this.A0F;
                    if (A0B2 != null) {
                        l = AnonymousClass1YD.A04(A0B2);
                    } else {
                        l = null;
                    }
                    C138156wc.A00(r5, l, str3, str10, 4);
                } else {
                    AnonymousClass3MW.A1D();
                    throw null;
                }
            } else {
                C18070vi.A11("ctwaBizUserJourneyLogger");
                throw null;
            }
        }
        C20941Abv abv4 = this.A06;
        if (abv4 != null) {
            str4 = abv4.A0B;
        } else {
            str4 = null;
        }
        boolean A18 = C18070vi.A18(str4, "facebook");
        WaTextView waTextView = this.A0L;
        if (A18) {
            if (waTextView != null) {
                AnonymousClass00H r05 = this.A0C;
                if (r05 != null) {
                    waTextView.setText(((AnonymousClass118) r05.get()).A01(2131889158));
                } else {
                    C18070vi.A11("waContext");
                    throw null;
                }
            }
        } else if (waTextView != null) {
            AnonymousClass00H r06 = this.A0C;
            if (r06 != null) {
                waTextView.setText(((AnonymousClass118) r06.get()).A01(2131889160));
            } else {
                C18070vi.A11("waContext");
                throw null;
            }
        }
        C20941Abv abv5 = this.A06;
        if (abv5 == null || (str5 = abv5.A09) == null || str5.length() == 0) {
            A00(this);
        } else {
            AnonymousClass00H r07 = this.A0C;
            if (r07 != null) {
                Animation loadAnimation = AnimationUtils.loadAnimation(((AnonymousClass118) r07.get()).A00, 2130771980);
                C72453Mb.A1D(this.A04);
                ViewStub viewStub = this.A00;
                if (viewStub == null || (inflate = viewStub.inflate()) == null) {
                    waImageView = null;
                } else {
                    waImageView = AnonymousClass3MW.A0S(inflate, 2131427568);
                }
                this.A03 = waImageView;
                if (waImageView != null) {
                    waImageView.startAnimation(loadAnimation);
                }
                C72453Mb.A1C(this.A00);
                ((AnonymousClass4VT) this.A0M.getValue()).A02(this.A04, new C97994qO(this, 4), str5);
                C20941Abv abv6 = this.A06;
                if (abv6 == null || (str6 = abv6.A04) == null || str6.length() == 0) {
                    C72453Mb.A1D(this.A0K);
                    if (this.A0G) {
                        AnonymousClass00H r08 = this.A08;
                        if (r08 != null) {
                            C88654aI A0b2 = AnonymousClass3MW.A0b(r08);
                            UserJid userJid2 = this.A05;
                            C20941Abv abv7 = this.A06;
                            if (abv7 != null) {
                                str9 = abv7.A03;
                            }
                            C88654aI.A02(A0b2, userJid2, str9, 56);
                        } else {
                            C18070vi.A11("ctwaCustomerLoggingController");
                            throw null;
                        }
                    } else {
                        AnonymousClass00H r09 = this.A07;
                        if (r09 != null) {
                            C138156wc r4 = (C138156wc) r09.get();
                            C20941Abv abv8 = this.A06;
                            if (abv8 != null) {
                                str9 = abv8.A0C;
                            }
                            AnonymousClass00H r010 = this.A0A;
                            if (r010 != null) {
                                String A0B3 = C17880vN.A0H(r010).A0B();
                                String str11 = this.A0F;
                                if (A0B3 != null) {
                                    l2 = AnonymousClass1YD.A04(A0B3);
                                } else {
                                    l2 = null;
                                }
                                C138156wc.A00(r4, l2, str9, str11, 13);
                            } else {
                                AnonymousClass3MW.A1D();
                                throw null;
                            }
                        } else {
                            C18070vi.A11("ctwaBizUserJourneyLogger");
                            throw null;
                        }
                    }
                } else {
                    WaTextView waTextView2 = this.A0K;
                    if (waTextView2 != null) {
                        waTextView2.setText(str6);
                    }
                }
            } else {
                C18070vi.A11("waContext");
                throw null;
            }
        }
        C89924dF.A00(view.findViewById(2131428016), this, 31);
        WDSButton A0r = AnonymousClass3MW.A0r(view, 2131434431);
        AnonymousClass00H r011 = this.A0C;
        if (r011 != null) {
            AnonymousClass118 r1 = (AnonymousClass118) r011.get();
            if (A18) {
                A0r.setText(r1.A01(2131889159));
                AnonymousClass00H r012 = this.A0C;
                if (r012 != null) {
                    context = ((AnonymousClass118) r012.get()).A00;
                    i = 2131233617;
                }
            } else {
                A0r.setText(r1.A01(2131889161));
                AnonymousClass00H r013 = this.A0C;
                if (r013 != null) {
                    context = ((AnonymousClass118) r013.get()).A00;
                    i = 2131232208;
                }
            }
            A0r.setIcon(C24261Jm.A00(context, i));
            A0r.setOnClickListener(new C90014dO(this, A0r, 15));
            return;
        }
        C18070vi.A11("waContext");
        throw null;
    }

    public static final void A00(CtwaFMXAdPreviewFragment ctwaFMXAdPreviewFragment) {
        View view;
        Long l;
        View inflate;
        int A0D2 = C72453Mb.A0D(ctwaFMXAdPreviewFragment.A04);
        View view2 = ctwaFMXAdPreviewFragment.A0H;
        if (view2 != null) {
            view2.setVisibility(A0D2);
        }
        WaTextView waTextView = ctwaFMXAdPreviewFragment.A0K;
        if (waTextView != null) {
            waTextView.setVisibility(A0D2);
        }
        ViewStub viewStub = ctwaFMXAdPreviewFragment.A0J;
        String str = null;
        if (viewStub == null || (inflate = viewStub.inflate()) == null) {
            view = null;
        } else {
            view = inflate.findViewById(2131427563);
        }
        ctwaFMXAdPreviewFragment.A0I = view;
        C72453Mb.A1C(view);
        if (ctwaFMXAdPreviewFragment.A0G) {
            AnonymousClass00H r0 = ctwaFMXAdPreviewFragment.A08;
            if (r0 != null) {
                C88654aI A0b = AnonymousClass3MW.A0b(r0);
                UserJid userJid = ctwaFMXAdPreviewFragment.A05;
                C20941Abv abv = ctwaFMXAdPreviewFragment.A06;
                if (abv != null) {
                    str = abv.A03;
                }
                C88654aI.A02(A0b, userJid, str, 55);
                return;
            }
            C18070vi.A11("ctwaCustomerLoggingController");
            throw null;
        }
        AnonymousClass00H r02 = ctwaFMXAdPreviewFragment.A07;
        if (r02 != null) {
            C138156wc r3 = (C138156wc) r02.get();
            C20941Abv abv2 = ctwaFMXAdPreviewFragment.A06;
            if (abv2 != null) {
                str = abv2.A0C;
            }
            AnonymousClass00H r03 = ctwaFMXAdPreviewFragment.A0A;
            if (r03 != null) {
                String A0B2 = C17880vN.A0H(r03).A0B();
                String str2 = ctwaFMXAdPreviewFragment.A0F;
                if (A0B2 != null) {
                    l = AnonymousClass1YD.A04(A0B2);
                } else {
                    l = null;
                }
                C138156wc.A00(r3, l, str, str2, 12);
                return;
            }
            AnonymousClass3MW.A1D();
            throw null;
        }
        C18070vi.A11("ctwaBizUserJourneyLogger");
        throw null;
    }

    public void A1s() {
        Long l;
        super.A1s();
        String str = null;
        this.A01 = null;
        this.A0L = null;
        this.A04 = null;
        this.A03 = null;
        this.A0I = null;
        this.A00 = null;
        this.A0J = null;
        this.A0H = null;
        this.A0K = null;
        if (this.A0G) {
            AnonymousClass00H r0 = this.A08;
            if (r0 != null) {
                C88654aI A0b = AnonymousClass3MW.A0b(r0);
                UserJid userJid = this.A05;
                C20941Abv abv = this.A06;
                if (abv != null) {
                    str = abv.A03;
                }
                C88654aI.A02(A0b, userJid, str, 48);
                return;
            }
            C18070vi.A11("ctwaCustomerLoggingController");
            throw null;
        }
        AnonymousClass00H r02 = this.A07;
        if (r02 != null) {
            C138156wc r3 = (C138156wc) r02.get();
            C20941Abv abv2 = this.A06;
            if (abv2 != null) {
                str = abv2.A0C;
            }
            AnonymousClass00H r03 = this.A0A;
            if (r03 != null) {
                String A0B2 = C17880vN.A0H(r03).A0B();
                String str2 = this.A0F;
                if (A0B2 != null) {
                    l = AnonymousClass1YD.A04(A0B2);
                } else {
                    l = null;
                }
                C138156wc.A00(r3, l, str, str2, 5);
                return;
            }
            AnonymousClass3MW.A1D();
            throw null;
        }
        C18070vi.A11("ctwaBizUserJourneyLogger");
        throw null;
    }
}
