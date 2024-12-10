package com.whatsapp.phonematching;

import X.AnonymousClass000;
import X.AnonymousClass02n;
import X.AnonymousClass11C;
import X.AnonymousClass11S;
import X.AnonymousClass1FY;
import X.AnonymousClass1K3;
import X.AnonymousClass1L9;
import X.AnonymousClass1LA;
import X.AnonymousClass1LU;
import X.AnonymousClass1YF;
import X.AnonymousClass1YL;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3NT;
import X.AnonymousClass4W1;
import X.C139576z4;
import X.C17880vN;
import X.C17890vO;
import X.C17900vP;
import X.C18000vb;
import X.C18070vi;
import X.C19740yt;
import X.C20113A7w;
import X.C24261Jm;
import X.C41661wr;
import X.C63942tw;
import X.C72453Mb;
import X.C72463Mc;
import X.C77503qE;
import X.C89964dJ;
import X.C91084f7;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.whatsapp.WaEditText;
import com.whatsapp.components.PhoneNumberEntry;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.nio.charset.Charset;

public class CountryAndPhoneNumberFragment extends Hilt_CountryAndPhoneNumberFragment {
    public EditText A00;
    public TextView A01;
    public TextView A02;
    public TextView A03;
    public AnonymousClass1LA A04;
    public AnonymousClass1FY A05;
    public WaEditText A06;
    public PhoneNumberEntry A07;
    public AnonymousClass11C A08;
    public C18000vb A09;
    public AnonymousClass1LU A0A;
    public MatchPhoneNumberFragment A0B;
    public AnonymousClass1K3 A0C;
    public String A0D;
    public String A0E;
    public int A0F;
    public int A0G;
    public TextView A0H;
    public final AnonymousClass02n A0I = CDw(new C91084f7(this, 4), new Object());

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        WaEditText waEditText;
        WaEditText waEditText2;
        EditText editText;
        C18070vi.A0d(layoutInflater, 0);
        View A0B2 = AnonymousClass3MX.A0B(layoutInflater, viewGroup, 2131625013, false);
        this.A07 = (PhoneNumberEntry) A0B2.findViewById(2131433792);
        this.A02 = C17880vN.A0E(A0B2, 2131434455);
        this.A01 = C17880vN.A0E(A0B2, 2131434456);
        this.A03 = C17880vN.A0E(A0B2, 2131434463);
        this.A0H = C17880vN.A0E(A0B2, 2131434457);
        PhoneNumberEntry phoneNumberEntry = this.A07;
        if (phoneNumberEntry != null) {
            waEditText = phoneNumberEntry.A01;
        } else {
            waEditText = null;
        }
        this.A00 = waEditText;
        if (phoneNumberEntry != null) {
            waEditText2 = phoneNumberEntry.A02;
        } else {
            waEditText2 = null;
        }
        this.A06 = waEditText2;
        if (phoneNumberEntry != null) {
            phoneNumberEntry.A03 = new C77503qE(this);
        }
        AnonymousClass11C r0 = this.A08;
        if (r0 != null) {
            TelephonyManager A0K = r0.A0K();
            if (A0K == null) {
                Log.w("CountryAndPhoneNumberFragment tm=null");
            } else {
                Charset charset = AnonymousClass1K3.A06;
                String simCountryIso = A0K.getSimCountryIso();
                if (simCountryIso != null) {
                    try {
                        AnonymousClass1LA r02 = this.A04;
                        if (r02 != null) {
                            this.A0D = r02.A06(simCountryIso);
                        } else {
                            C18070vi.A11("countryPhoneInfo");
                            throw null;
                        }
                    } catch (IOException e) {
                        Log.e("CountryAndPhoneNumberFragment/iso/code failed to get code from CountryPhoneInfo", e);
                    }
                }
            }
            AnonymousClass1FY r1 = this.A05;
            if (r1 == null) {
                C18070vi.A11("activity");
                throw null;
            }
            Drawable A002 = C24261Jm.A00(r1, 2131230962);
            TextView textView = this.A02;
            if (textView != null) {
                textView.setBackground(A002);
            }
            WaEditText waEditText3 = this.A06;
            if (waEditText3 != null) {
                waEditText3.setTextDirection(3);
            }
            TextView textView2 = this.A02;
            if (textView2 != null) {
                C89964dJ.A00(textView2, this, 2);
            }
            WaEditText waEditText4 = this.A06;
            if (waEditText4 != null) {
                waEditText4.requestFocus();
            }
            WaEditText waEditText5 = this.A06;
            if (waEditText5 != null) {
                this.A0G = AnonymousClass4W1.A00(waEditText5);
                EditText editText2 = this.A00;
                if (editText2 != null) {
                    this.A0F = AnonymousClass4W1.A00(editText2);
                    String str = this.A0D;
                    if (!(str == null || (editText = this.A00) == null)) {
                        editText.setText(str);
                    }
                    String str2 = this.A0E;
                    if (!(str2 == null || str2.length() == 0)) {
                        C17900vP.A0f("CountryAndPhoneNumberFragment/country: ", str2, AnonymousClass000.A10());
                        PhoneNumberEntry phoneNumberEntry2 = this.A07;
                        if (phoneNumberEntry2 != null) {
                            phoneNumberEntry2.A03(str2);
                        }
                    }
                    return A0B2;
                }
                throw AnonymousClass000.A0n("Required value was null.");
            }
            throw AnonymousClass000.A0n("Required value was null.");
        }
        AnonymousClass3MW.A1N();
        throw null;
    }

    public void A1x(Context context) {
        C18070vi.A0d(context, 0);
        super.A1x(context);
        this.A05 = (AnonymousClass1FY) AnonymousClass1L9.A01(context, AnonymousClass1FY.class);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        return A1H(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        r1 = new java.lang.Object[1];
        r0 = r7.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        if (r0 == null) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        r4 = r0.getText();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        return X.AnonymousClass3MX.A16(r7, r4, r1, 0, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A27(int r8) {
        /*
            r7 = this;
            r6 = 0
            r5 = 1
            r4 = 0
            switch(r8) {
                case 2: goto L_0x002c;
                case 3: goto L_0x0024;
                case 4: goto L_0x0020;
                case 5: goto L_0x001c;
                case 6: goto L_0x0018;
                default: goto L_0x0006;
            }
        L_0x0006:
            r2 = 2131894977(0x7f1222c1, float:1.9424774E38)
        L_0x0009:
            java.lang.Object[] r1 = new java.lang.Object[r5]
            android.widget.TextView r0 = r7.A02
            if (r0 == 0) goto L_0x0013
            java.lang.CharSequence r4 = r0.getText()
        L_0x0013:
            java.lang.String r0 = X.AnonymousClass3MX.A16(r7, r4, r1, r6, r2)
            return r0
        L_0x0018:
            r2 = 2131894978(0x7f1222c2, float:1.9424776E38)
            goto L_0x0009
        L_0x001c:
            r2 = 2131894979(0x7f1222c3, float:1.9424778E38)
            goto L_0x0009
        L_0x0020:
            r0 = 2131894987(0x7f1222cb, float:1.9424794E38)
            goto L_0x0027
        L_0x0024:
            r0 = 2131894974(0x7f1222be, float:1.9424768E38)
        L_0x0027:
            java.lang.String r0 = r7.A1H(r0)
            return r0
        L_0x002c:
            X.1FY r3 = r7.A05
            if (r3 != 0) goto L_0x0036
            java.lang.String r0 = "activity"
            X.C18070vi.A11(r0)
            throw r4
        L_0x0036:
            r2 = 2131894973(0x7f1222bd, float:1.9424766E38)
            java.lang.Object[] r1 = X.AnonymousClass3MW.A1b()
            X.C17880vN.A1T(r1, r5, r6)
            r0 = 3
            X.C17880vN.A1T(r1, r0, r5)
            java.lang.String r0 = r3.getString(r2, r1)
            X.C18070vi.A0X(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.phonematching.CountryAndPhoneNumberFragment.A27(int):java.lang.String");
    }

    public static final void A01(CountryAndPhoneNumberFragment countryAndPhoneNumberFragment, boolean z) {
        String str;
        int i;
        Drawable background;
        TextView textView = countryAndPhoneNumberFragment.A0H;
        if (textView != null) {
            AnonymousClass1FY r2 = countryAndPhoneNumberFragment.A05;
            str = "activity";
            if (r2 != null) {
                int i2 = 2130971197;
                int i3 = 2131102532;
                if (z) {
                    i2 = 2130970927;
                    i3 = 2131102371;
                }
                C72463Mc.A0y(r2, textView, i2, i3);
            }
            C18070vi.A11(str);
            throw null;
        }
        if (z) {
            i = AnonymousClass1YL.A00(countryAndPhoneNumberFragment.A1n(), 2130970927, 2131102371);
        } else {
            i = 2131102523;
        }
        AnonymousClass1FY r0 = countryAndPhoneNumberFragment.A05;
        if (r0 == null) {
            str = "activity";
            C18070vi.A11(str);
            throw null;
        }
        int A002 = C19740yt.A00(r0, i);
        TextView textView2 = countryAndPhoneNumberFragment.A02;
        if (!(textView2 == null || (background = textView2.getBackground()) == null)) {
            background.setColorFilter(A002, PorterDuff.Mode.SRC_IN);
        }
        TextView textView3 = countryAndPhoneNumberFragment.A01;
        if (textView3 != null) {
            textView3.setVisibility(C72453Mb.A06(z ? 1 : 0));
        }
    }

    public final int A26() {
        Editable editable;
        EditText editText = this.A00;
        Editable editable2 = null;
        if (editText != null) {
            editable = editText.getText();
        } else {
            editable = null;
        }
        String A0I2 = AnonymousClass1YF.A0I(String.valueOf(editable));
        WaEditText waEditText = this.A06;
        if (waEditText != null) {
            editable2 = waEditText.getText();
        }
        String valueOf = String.valueOf(editable2);
        AnonymousClass1LA r1 = this.A04;
        if (r1 != null) {
            return C63942tw.A00(r1, (C139576z4) null, A0I2, valueOf);
        }
        C18070vi.A11("countryPhoneInfo");
        throw null;
    }

    public final void A28() {
        Editable editable;
        Editable editable2;
        View view;
        EditText editText = this.A00;
        if (editText != null) {
            editable = editText.getText();
        } else {
            editable = null;
        }
        String A0I2 = AnonymousClass1YF.A0I(String.valueOf(editable));
        WaEditText waEditText = this.A06;
        if (waEditText != null) {
            editable2 = waEditText.getText();
        } else {
            editable2 = null;
        }
        String valueOf = String.valueOf(editable2);
        int A26 = A26();
        String str = "activity";
        switch (A26) {
            case 2:
                AnonymousClass1FY r1 = this.A05;
                if (r1 != null) {
                    r1.BhR(A27(A26));
                    break;
                } else {
                    C18070vi.A11(str);
                    throw null;
                }
            case 3:
                AnonymousClass1FY r12 = this.A05;
                if (r12 != null) {
                    r12.BhR(A1H(2131894974));
                    EditText editText2 = this.A00;
                    if (editText2 != null) {
                        editText2.setText("");
                        break;
                    }
                } else {
                    C18070vi.A11(str);
                    throw null;
                }
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                AnonymousClass1FY r13 = this.A05;
                if (r13 != null) {
                    r13.BhR(A27(A26));
                    view = this.A06;
                    break;
                } else {
                    C18070vi.A11(str);
                    throw null;
                }
            default:
                int parseInt = Integer.parseInt(A0I2);
                String A002 = new C41661wr("\\D").A00(valueOf, "");
                try {
                    AnonymousClass1LA r0 = this.A04;
                    if (r0 != null) {
                        A002 = r0.A03(parseInt, A002);
                        StringBuilder A10 = AnonymousClass000.A10();
                        A10.append("CountryAndPhoneNumberFragment/phone/cc=");
                        A10.append(A0I2);
                        C17900vP.A0f("/number=", A002, A10);
                        this.A0D = A0I2;
                        MatchPhoneNumberFragment matchPhoneNumberFragment = this.A0B;
                        if (matchPhoneNumberFragment != null) {
                            int A17 = C18070vi.A17(A0I2, A002);
                            StringBuilder A102 = AnonymousClass000.A10();
                            A102.append("MatchPhoneNumberFragment/submit/cc ");
                            A102.append(A0I2);
                            A102.append(" ph=");
                            A102.append(A002);
                            A102.append(" jid=");
                            AnonymousClass11S r02 = matchPhoneNumberFragment.A00;
                            if (r02 != null) {
                                Log.w(C17890vO.A0V(AnonymousClass11S.A00(r02), A102));
                                AnonymousClass3NT r03 = matchPhoneNumberFragment.A02;
                                if (r03 != null) {
                                    r03.A00.CN9();
                                    AnonymousClass3NT r04 = matchPhoneNumberFragment.A02;
                                    if (r04 != null) {
                                        r04.sendEmptyMessageDelayed(4, C20113A7w.A0L);
                                        AnonymousClass3NT r05 = matchPhoneNumberFragment.A02;
                                        if (r05 != null) {
                                            if (!r05.A00.CHU(A0I2, A002)) {
                                                AnonymousClass3NT r06 = matchPhoneNumberFragment.A02;
                                                if (r06 != null) {
                                                    r06.removeMessages(4);
                                                    AnonymousClass3NT r07 = matchPhoneNumberFragment.A02;
                                                    if (r07 != null) {
                                                        r07.A00.BIv();
                                                        AnonymousClass1FY r3 = matchPhoneNumberFragment.A01;
                                                        if (r3 != null) {
                                                            r3.BhR(C17880vN.A0q(r3, r3.getString(2131888733), new Object[A17], 0, 2131894981));
                                                            return;
                                                        }
                                                    }
                                                }
                                            } else {
                                                return;
                                            }
                                        }
                                    }
                                }
                                C18070vi.A11("handler");
                                throw null;
                            }
                            str = "meManager";
                            C18070vi.A11(str);
                            throw null;
                        }
                        return;
                    }
                    C18070vi.A11("countryPhoneInfo");
                    throw null;
                } catch (IOException e) {
                    Log.e("CountryAndPhoneNumberFragment/phone failed trimLeadingZero from CountryPhoneInfo", e);
                }
        }
        view = this.A00;
        if (view != null) {
            view.requestFocus();
        }
    }

    public void A1s() {
        super.A1s();
        this.A07 = null;
        this.A02 = null;
        this.A01 = null;
        this.A03 = null;
        this.A0H = null;
        this.A00 = null;
        this.A06 = null;
        this.A0B = null;
    }

    public void A1t() {
        super.A1t();
        WaEditText waEditText = this.A06;
        if (waEditText != null) {
            this.A0G = AnonymousClass4W1.A00(waEditText);
            EditText editText = this.A00;
            if (editText != null) {
                this.A0F = AnonymousClass4W1.A00(editText);
                return;
            }
            throw AnonymousClass000.A0n("Required value was null.");
        }
        throw AnonymousClass000.A0n("Required value was null.");
    }

    public void A1u() {
        TextView textView;
        EditText editText;
        super.A1u();
        String str = this.A0D;
        if (!(str == null || (editText = this.A00) == null)) {
            editText.setText(str);
        }
        String str2 = this.A0E;
        if (!(str2 == null || (textView = this.A02) == null)) {
            AnonymousClass1K3 r1 = this.A0C;
            if (r1 != null) {
                C18000vb r0 = this.A09;
                if (r0 != null) {
                    textView.setText(r1.A03(r0, str2));
                } else {
                    AnonymousClass3MW.A1M();
                    throw null;
                }
            } else {
                C18070vi.A11("countryUtils");
                throw null;
            }
        }
        EditText editText2 = this.A00;
        if (editText2 != null) {
            AnonymousClass4W1.A01(editText2, this.A0F);
            WaEditText waEditText = this.A06;
            if (waEditText != null) {
                AnonymousClass4W1.A01(waEditText, this.A0G);
                WaEditText waEditText2 = this.A06;
                if (waEditText2 != null) {
                    waEditText2.clearFocus();
                    return;
                }
                return;
            }
            throw AnonymousClass000.A0n("Required value was null.");
        }
        throw AnonymousClass000.A0n("Required value was null.");
    }
}
