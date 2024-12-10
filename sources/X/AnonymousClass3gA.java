package X;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.RadioButton;
import android.widget.TextView;
import com.whatsapp.avatar.privacy.AvatarStickerPrivacySettings;
import com.whatsapp.group.GroupAddPrivacyActivity;
import com.whatsapp.profile.AboutStatusPrivacyActivity;
import com.whatsapp.profile.PixPrivacyActivity;
import com.whatsapp.profile.ProfilePhotoPrivacyActivity;
import com.whatsapp.wds.components.banners.WDSBanner;
import com.whatsapp.wds.components.list.footer.WDSSectionFooter;
import com.whatsapp.wds.components.list.header.WDSSectionHeader;

/* renamed from: X.3gA  reason: invalid class name */
public abstract class AnonymousClass3gA extends AnonymousClass1FY implements C1604688p {
    public RadioButton A00;
    public RadioButton A01;
    public RadioButton A02;
    public RadioButton A03;
    public RadioButton A04;
    public C26261Rl A05;
    public AnonymousClass1LU A06;
    public AnonymousClass129 A07;
    public C37301pI A08;
    public WDSBanner A09;
    public final C86524Rz A0A = new Object();

    public /* synthetic */ void C5C(String str, String str2) {
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1 && i2 == -1) {
            finish();
        }
        super.onActivityResult(i, i2, intent);
    }

    private final void A03(RadioButton radioButton, int i) {
        if (radioButton != null) {
            radioButton.setVisibility(C72453Mb.A07(C63682tW.A03(A4c(), i) ? 1 : 0));
            C26173Ctq.A01(new ColorStateList(new int[][]{new int[]{-16842912}, new int[]{16842912}}, new int[]{AnonymousClass3Ma.A00(AnonymousClass3MY.A04(radioButton), 2130970900, 2131102334), AnonymousClass3Ma.A00(AnonymousClass3MY.A04(radioButton), 2130970899, 2131102333)}), radioButton);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0011, code lost:
        if (r5 == 6) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A0Q(android.widget.RadioButton r4, int r5, int r6, boolean r7) {
        /*
            r3 = this;
            if (r5 != r6) goto L_0x0021
            if (r7 == 0) goto L_0x0021
            X.4Rz r0 = r3.A0A
            r0.A01(r4)
        L_0x0009:
            r0 = 1
            if (r5 == r0) goto L_0x0013
            r0 = 3
            if (r5 == r0) goto L_0x0013
            r0 = 6
            r2 = 1
            if (r5 != r0) goto L_0x0014
        L_0x0013:
            r2 = 0
        L_0x0014:
            com.whatsapp.wds.components.banners.WDSBanner r1 = r3.A09
            if (r1 == 0) goto L_0x0020
            r0 = 0
            if (r2 == 0) goto L_0x001d
            r0 = 8
        L_0x001d:
            r1.setVisibility(r0)
        L_0x0020:
            return
        L_0x0021:
            boolean r0 = X.AnonymousClass000.A1T(r5, r6)
            r4.setChecked(r0)
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3gA.A0Q(android.widget.RadioButton, int, int, boolean):void");
    }

    public static void A0V(AnonymousClass10E r1, AnonymousClass10G r2, AnonymousClass3gA r3) {
        r3.A07 = (AnonymousClass129) r1.A4I.get();
        r3.A08 = (C37301pI) r2.A3I.get();
        r3.A05 = (C26261Rl) r1.A8j.get();
        r3.A06 = (AnonymousClass1LU) r1.ABd.get();
    }

    public int A4b() {
        if (this instanceof ProfilePhotoPrivacyActivity) {
            return 2131895988;
        }
        if (this instanceof PixPrivacyActivity) {
            return 2131895986;
        }
        if (this instanceof AboutStatusPrivacyActivity) {
            return 2131895972;
        }
        if (this instanceof GroupAddPrivacyActivity) {
            return 2131895983;
        }
        return 2131886851;
    }

    public String A4c() {
        if (this instanceof ProfilePhotoPrivacyActivity) {
            return "profile";
        }
        if (this instanceof PixPrivacyActivity) {
            return "pix";
        }
        if (this instanceof AboutStatusPrivacyActivity) {
            return "status";
        }
        if (this instanceof GroupAddPrivacyActivity) {
            return "groupadd";
        }
        return "stickers";
    }

    public void C5L() {
        this.A05.A0J(new C21448AkF(this, 33));
    }

    public void A4d() {
        String str;
        String A4c = A4c();
        C26261Rl r0 = this.A05;
        if (r0 != null) {
            int A002 = r0.A00(A4c);
            C26261Rl r02 = this.A05;
            if (r02 != null) {
                boolean z = true;
                if (r02.A06.get(A4c) == null) {
                    z = false;
                    this.A0A.A00();
                }
                RadioButton radioButton = this.A01;
                if (radioButton != null) {
                    A0Q(radioButton, A002, 1, z);
                    RadioButton radioButton2 = this.A00;
                    if (radioButton2 != null) {
                        A0Q(radioButton2, A002, 0, z);
                        RadioButton radioButton3 = this.A03;
                        if (radioButton3 != null) {
                            A0Q(radioButton3, A002, 2, z);
                            RadioButton radioButton4 = this.A02;
                            if (radioButton4 != null) {
                                A0Q(radioButton4, A002, 3, z);
                                RadioButton radioButton5 = this.A04;
                                if (radioButton5 != null) {
                                    A0Q(radioButton5, A002, 6, z);
                                    return;
                                }
                                return;
                            }
                            str = "myContactsExceptButton";
                        } else {
                            str = "nobodyButton";
                        }
                    } else {
                        str = "everyoneButton";
                    }
                } else {
                    str = "myContactsButton";
                }
                C18070vi.A11(str);
                throw null;
            }
        }
        str = "privacySettingManager";
        C18070vi.A11(str);
        throw null;
    }

    public void onCreate(Bundle bundle) {
        String str;
        int i;
        int i2;
        int i3;
        boolean A022;
        int i4;
        super.onCreate(bundle);
        C26261Rl r0 = this.A05;
        if (r0 != null) {
            r0.observeUntilDestroy(this, this);
            boolean z = this instanceof ProfilePhotoPrivacyActivity;
            if (z) {
                i = 2131626637;
            } else {
                i = 2131625442;
            }
            setContentView(i);
            C003401n supportActionBar = getSupportActionBar();
            C72473Md.A16(supportActionBar);
            if (z) {
                i2 = 2131895987;
            } else if (this instanceof PixPrivacyActivity) {
                i2 = 2131894612;
            } else if (this instanceof AboutStatusPrivacyActivity) {
                i2 = 2131895984;
            } else if (this instanceof GroupAddPrivacyActivity) {
                i2 = 2131895981;
            } else {
                i2 = 2131886849;
            }
            supportActionBar.A0M(i2);
            RadioButton radioButton = (RadioButton) AnonymousClass3MY.A0H(this, 2131432891);
            C18070vi.A0d(radioButton, 0);
            this.A01 = radioButton;
            RadioButton radioButton2 = (RadioButton) AnonymousClass3MY.A0H(this, 2131430642);
            C18070vi.A0d(radioButton2, 0);
            this.A00 = radioButton2;
            RadioButton radioButton3 = (RadioButton) AnonymousClass3MY.A0H(this, 2131432892);
            C18070vi.A0d(radioButton3, 0);
            this.A02 = radioButton3;
            RadioButton radioButton4 = (RadioButton) AnonymousClass3MY.A0H(this, 2131433170);
            C18070vi.A0d(radioButton4, 0);
            this.A03 = radioButton4;
            this.A04 = (RadioButton) findViewById(2131435103);
            View findViewById = findViewById(2131431358);
            boolean A062 = AnonymousClass1J8.A06(this.A0E);
            if (z) {
                i3 = 2131626638;
            } else {
                i3 = 2131625444;
            }
            if (A062) {
                i3 = 2131627597;
            }
            if (findViewById instanceof ViewStub) {
                findViewById = AnonymousClass3MY.A0G((ViewStub) findViewById, i3);
            }
            if ((findViewById instanceof WDSSectionHeader) && AnonymousClass1J8.A06(this.A0E)) {
                ((WDSSectionHeader) findViewById).setHeaderText(A4b());
            } else if (findViewById instanceof TextView) {
                ((TextView) findViewById).setText(A4b());
            }
            if (z || (this instanceof PixPrivacyActivity) || (this instanceof AboutStatusPrivacyActivity)) {
                C72463Mc.A19(this, 2131430949);
            } else {
                if (this instanceof GroupAddPrivacyActivity) {
                    i4 = 2131895982;
                } else {
                    i4 = 2131886850;
                }
                View findViewById2 = findViewById(2131430949);
                if (findViewById2 instanceof ViewStub) {
                    ViewStub viewStub = (ViewStub) findViewById2;
                    int i5 = 2131625443;
                    if (AnonymousClass1J8.A06(this.A0E)) {
                        i5 = 2131627594;
                    }
                    findViewById2 = AnonymousClass3MY.A0G(viewStub, i5);
                }
                if ((findViewById2 instanceof WDSSectionFooter) && AnonymousClass1J8.A06(this.A0E)) {
                    ((WDSSectionFooter) findViewById2).setFooterText(getResources().getString(i4));
                } else if (findViewById2 instanceof TextView) {
                    ((TextView) findViewById2).setText(i4);
                }
            }
            RadioButton radioButton5 = this.A01;
            if (radioButton5 != null) {
                radioButton5.setText(2131894757);
                RadioButton radioButton6 = this.A00;
                if (radioButton6 != null) {
                    radioButton6.setText(2131894759);
                    RadioButton radioButton7 = this.A02;
                    if (radioButton7 != null) {
                        radioButton7.setText(2131890879);
                        RadioButton radioButton8 = this.A03;
                        if (radioButton8 != null) {
                            radioButton8.setText(2131894760);
                            RadioButton radioButton9 = this.A04;
                            if (radioButton9 != null) {
                                radioButton9.setText(2131894779);
                            }
                            RadioButton radioButton10 = this.A01;
                            if (radioButton10 != null) {
                                C89964dJ.A00(radioButton10, this, 7);
                                RadioButton radioButton11 = this.A00;
                                if (radioButton11 != null) {
                                    C89964dJ.A00(radioButton11, this, 8);
                                    RadioButton radioButton12 = this.A02;
                                    if (radioButton12 != null) {
                                        C89964dJ.A00(radioButton12, this, 9);
                                        RadioButton radioButton13 = this.A03;
                                        if (radioButton13 != null) {
                                            C89964dJ.A00(radioButton13, this, 10);
                                            RadioButton radioButton14 = this.A04;
                                            if (radioButton14 != null) {
                                                C89964dJ.A00(radioButton14, this, 11);
                                            }
                                            RadioButton radioButton15 = this.A01;
                                            if (radioButton15 != null) {
                                                A03(radioButton15, 1);
                                                RadioButton radioButton16 = this.A00;
                                                if (radioButton16 != null) {
                                                    A03(radioButton16, 0);
                                                    RadioButton radioButton17 = this.A03;
                                                    if (radioButton17 != null) {
                                                        A03(radioButton17, 2);
                                                        RadioButton radioButton18 = this.A02;
                                                        if (radioButton18 != null) {
                                                            A03(radioButton18, 3);
                                                            A03(this.A04, 6);
                                                            if (z) {
                                                                A022 = AnonymousClass3MX.A0g(((ProfilePhotoPrivacyActivity) this).A02).A02();
                                                            } else if (this instanceof PixPrivacyActivity) {
                                                                return;
                                                            } else {
                                                                if (this instanceof AboutStatusPrivacyActivity) {
                                                                    A022 = AnonymousClass3MX.A0g(((AboutStatusPrivacyActivity) this).A01).A02();
                                                                } else if (this instanceof GroupAddPrivacyActivity) {
                                                                    A022 = AnonymousClass3MX.A0g(((GroupAddPrivacyActivity) this).A01).A02();
                                                                } else {
                                                                    AnonymousClass1UN r02 = ((AvatarStickerPrivacySettings) this).A00;
                                                                    if (r02 != null) {
                                                                        A022 = r02.A02();
                                                                    } else {
                                                                        str = "nativeContactGateKeeper";
                                                                    }
                                                                }
                                                            }
                                                            if (A022) {
                                                                WDSBanner wDSBanner = (WDSBanner) AnonymousClass3MY.A0G(AnonymousClass3MX.A0H(this, 2131437009), 2131624145).findViewById(2131428058);
                                                                this.A09 = wDSBanner;
                                                                if (z) {
                                                                    if (wDSBanner != null) {
                                                                        C88554a7.A03(this, wDSBanner, 2131893407);
                                                                        C89964dJ.A00(wDSBanner, this, 39);
                                                                        return;
                                                                    }
                                                                    return;
                                                                } else if (this instanceof AboutStatusPrivacyActivity) {
                                                                    if (wDSBanner != null) {
                                                                        C88554a7.A03(this, wDSBanner, 2131893407);
                                                                        C89964dJ.A00(wDSBanner, this, 33);
                                                                        return;
                                                                    }
                                                                    return;
                                                                } else if (this instanceof GroupAddPrivacyActivity) {
                                                                    if (wDSBanner != null) {
                                                                        C88554a7.A03(this, wDSBanner, 2131893407);
                                                                        C89944dH.A00(wDSBanner, this, 43);
                                                                        return;
                                                                    }
                                                                    return;
                                                                } else if ((this instanceof AvatarStickerPrivacySettings) && wDSBanner != null) {
                                                                    C88554a7.A03(this, wDSBanner, 2131893407);
                                                                    AnonymousClass3MZ.A1J(wDSBanner, this, 16);
                                                                    return;
                                                                } else {
                                                                    return;
                                                                }
                                                            } else {
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
                        str = "nobodyButton";
                    }
                    str = "myContactsExceptButton";
                }
                str = "everyoneButton";
            }
            str = "myContactsButton";
        } else {
            str = "privacySettingManager";
        }
        C18070vi.A11(str);
        throw null;
    }

    public void onResume() {
        int i;
        super.onResume();
        A4d();
        if (this instanceof ProfilePhotoPrivacyActivity) {
            i = 2;
        } else if (this instanceof PixPrivacyActivity) {
            i = 6;
        } else if (this instanceof AboutStatusPrivacyActivity) {
            i = 3;
        } else if (this instanceof GroupAddPrivacyActivity) {
            i = 4;
        } else {
            i = 5;
        }
        WDSBanner wDSBanner = this.A09;
        if (wDSBanner != null && wDSBanner.getVisibility() == 0) {
            C37301pI r0 = this.A08;
            if (r0 != null) {
                r0.A01(i);
            } else {
                C18070vi.A11("nativeContactsLogUtil");
                throw null;
            }
        }
    }
}
