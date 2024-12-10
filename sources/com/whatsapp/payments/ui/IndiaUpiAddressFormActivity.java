package com.whatsapp.payments.ui;

import X.AnonymousClass1FY;
import X.C003401n;
import X.C18070vi;
import X.C24076Bv2;
import X.C28477E2s;
import X.D4L;
import android.os.Bundle;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.WaEditText;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.List;

public final class IndiaUpiAddressFormActivity extends AnonymousClass1FY implements C28477E2s {
    public WaEditText A00;
    public WaEditText A01;
    public WaEditText A02;
    public WaEditText A03;
    public WaEditText A04;
    public WaEditText A05;
    public WaEditText A06;
    public WaEditText A07;
    public WaEditText A08;
    public D4L A09;
    public D4L A0A;
    public D4L A0B;
    public D4L A0C;
    public D4L A0D;
    public D4L A0E;
    public D4L A0F;
    public D4L A0G;
    public D4L A0H;
    public WDSButton A0I;
    public List A0J;

    /* JADX WARNING: type inference failed for: r28v0, types: [java.lang.Object, X.E6j] */
    /* JADX WARNING: type inference failed for: r34v0, types: [java.lang.Object, X.E6j] */
    /* JADX WARNING: type inference failed for: r39v0, types: [java.lang.Object, X.E6j] */
    /* JADX WARNING: type inference failed for: r44v0, types: [java.lang.Object, X.E6j] */
    /* JADX WARNING: type inference failed for: r49v0, types: [java.lang.Object, X.E6j] */
    /* JADX WARNING: type inference failed for: r0v41, types: [java.lang.Object, X.E6j] */
    /* JADX WARNING: type inference failed for: r54v0, types: [java.lang.Object, X.E6j] */
    /* JADX WARNING: type inference failed for: r9v0, types: [java.lang.Object, X.E6j] */
    /* JADX WARNING: type inference failed for: r59v0, types: [java.lang.Object, X.E6j] */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.addFlags(DefaultCrypto.BUFFER_SIZE);
        }
        setContentView(2131625607);
        setSupportActionBar((Toolbar) findViewById(2131436270));
        C003401n supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0M(2131893798);
            supportActionBar.A0W(true);
        }
        this.A04 = (WaEditText) C18070vi.A05(this.A00, 2131432910);
        this.A05 = (WaEditText) C18070vi.A05(this.A00, 2131433785);
        this.A00 = (WaEditText) C18070vi.A05(this.A00, 2131427669);
        this.A02 = (WaEditText) C18070vi.A05(this.A00, 2131430912);
        this.A08 = (WaEditText) C18070vi.A05(this.A00, 2131436335);
        this.A03 = (WaEditText) C18070vi.A05(this.A00, 2131431929);
        this.A01 = (WaEditText) C18070vi.A05(this.A00, 2131429112);
        this.A06 = (WaEditText) C18070vi.A05(this.A00, 2131433843);
        this.A07 = (WaEditText) C18070vi.A05(this.A00, 2131435601);
        this.A0I = (WDSButton) C18070vi.A05(this.A00, 2131429338);
        WaEditText waEditText = this.A04;
        if (waEditText != null) {
            C24076Bv2 bv2 = new C24076Bv2(waEditText, this, new Object(), 0, 42);
            this.A0D = bv2;
            WaEditText waEditText2 = this.A05;
            if (waEditText2 != null) {
                C24076Bv2 bv22 = new C24076Bv2(waEditText2, this, new Object(), 1, 42);
                this.A0E = bv22;
                WaEditText waEditText3 = this.A00;
                if (waEditText3 != null) {
                    C24076Bv2 bv23 = new C24076Bv2(waEditText3, this, new Object(), 2, 42);
                    this.A09 = bv23;
                    WaEditText waEditText4 = this.A06;
                    if (waEditText4 != null) {
                        C24076Bv2 bv24 = new C24076Bv2(waEditText4, this, new Object(), 3, 42);
                        this.A0F = bv24;
                        WaEditText waEditText5 = this.A01;
                        if (waEditText5 != null) {
                            C24076Bv2 bv25 = new C24076Bv2(waEditText5, this, new Object(), 4, 42);
                            this.A0A = bv25;
                            WaEditText waEditText6 = this.A02;
                            if (waEditText6 != null) {
                                D4L bv26 = new C24076Bv2(waEditText6, this, new Object(), 5);
                                this.A0B = bv26;
                                WaEditText waEditText7 = this.A03;
                                if (waEditText7 != null) {
                                    C24076Bv2 bv27 = new C24076Bv2(waEditText7, this, new Object(), 6, 42);
                                    this.A0C = bv27;
                                    WaEditText waEditText8 = this.A08;
                                    if (waEditText8 != null) {
                                        D4L bv28 = new C24076Bv2(waEditText8, this, new Object(), 7);
                                        this.A0H = bv28;
                                        WaEditText waEditText9 = this.A07;
                                        if (waEditText9 != null) {
                                            C24076Bv2 bv29 = new C24076Bv2(waEditText9, this, new Object(), 8, 42);
                                            this.A0G = bv29;
                                            D4L[] d4lArr = new D4L[9];
                                            d4lArr[0] = bv2;
                                            d4lArr[1] = bv22;
                                            d4lArr[2] = bv24;
                                            d4lArr[3] = bv23;
                                            d4lArr[4] = bv27;
                                            d4lArr[5] = bv28;
                                            d4lArr[6] = bv26;
                                            d4lArr[7] = bv25;
                                            this.A0J = C18070vi.A0O(bv29, d4lArr, 8);
                                            WaEditText waEditText10 = this.A04;
                                            if (waEditText10 != null) {
                                                D4L d4l = this.A0D;
                                                if (d4l == null) {
                                                    C18070vi.A11("nameTextWatcher");
                                                } else {
                                                    waEditText10.addTextChangedListener(d4l);
                                                    WaEditText waEditText11 = this.A05;
                                                    if (waEditText11 != null) {
                                                        D4L d4l2 = this.A0E;
                                                        if (d4l2 == null) {
                                                            C18070vi.A11("phoneNumberTextWatcher");
                                                        } else {
                                                            waEditText11.addTextChangedListener(d4l2);
                                                            WaEditText waEditText12 = this.A00;
                                                            if (waEditText12 != null) {
                                                                D4L d4l3 = this.A09;
                                                                if (d4l3 == null) {
                                                                    C18070vi.A11("addressLineTextWatcher");
                                                                } else {
                                                                    waEditText12.addTextChangedListener(d4l3);
                                                                    WaEditText waEditText13 = this.A01;
                                                                    if (waEditText13 != null) {
                                                                        D4L d4l4 = this.A0A;
                                                                        if (d4l4 == null) {
                                                                            C18070vi.A11("cityTextWatcher");
                                                                        } else {
                                                                            waEditText13.addTextChangedListener(d4l4);
                                                                            WaEditText waEditText14 = this.A07;
                                                                            if (waEditText14 != null) {
                                                                                D4L d4l5 = this.A0G;
                                                                                if (d4l5 == null) {
                                                                                    C18070vi.A11("stateTextWatcher");
                                                                                } else {
                                                                                    waEditText14.addTextChangedListener(d4l5);
                                                                                    WaEditText waEditText15 = this.A06;
                                                                                    if (waEditText15 != null) {
                                                                                        D4L d4l6 = this.A0F;
                                                                                        if (d4l6 == null) {
                                                                                            C18070vi.A11("pinCodeTextWatcher");
                                                                                        } else {
                                                                                            waEditText15.addTextChangedListener(d4l6);
                                                                                            WaEditText waEditText16 = this.A02;
                                                                                            if (waEditText16 != null) {
                                                                                                D4L d4l7 = this.A0B;
                                                                                                if (d4l7 == null) {
                                                                                                    C18070vi.A11("floorTextWatcher");
                                                                                                } else {
                                                                                                    waEditText16.addTextChangedListener(d4l7);
                                                                                                    WaEditText waEditText17 = this.A03;
                                                                                                    if (waEditText17 != null) {
                                                                                                        D4L d4l8 = this.A0C;
                                                                                                        if (d4l8 == null) {
                                                                                                            C18070vi.A11("landMarkTextWatcher");
                                                                                                        } else {
                                                                                                            waEditText17.addTextChangedListener(d4l8);
                                                                                                            WaEditText waEditText18 = this.A08;
                                                                                                            if (waEditText18 != null) {
                                                                                                                D4L d4l9 = this.A0H;
                                                                                                                if (d4l9 == null) {
                                                                                                                    C18070vi.A11("towerTextWatcher");
                                                                                                                } else {
                                                                                                                    waEditText18.addTextChangedListener(d4l9);
                                                                                                                    return;
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                throw null;
                                            }
                                        }
                                        C18070vi.A11("stateInput");
                                        throw null;
                                    }
                                    C18070vi.A11("towerInput");
                                    throw null;
                                }
                                C18070vi.A11("landMarkInput");
                                throw null;
                            }
                            C18070vi.A11("floorInput");
                            throw null;
                        }
                        C18070vi.A11("cityInput");
                        throw null;
                    }
                    C18070vi.A11("pinCodeInput");
                    throw null;
                }
                C18070vi.A11("addressInput");
                throw null;
            }
            C18070vi.A11("phoneNumberInput");
            throw null;
        }
        C18070vi.A11("nameInput");
        throw null;
    }
}
