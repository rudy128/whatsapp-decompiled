package com.whatsapp.registration.flashcall;

import X.A9B;
import X.AFS;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass1GP;
import X.AnonymousClass1LU;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass4CG;
import X.AnonymousClass8BR;
import X.AnonymousClass8BV;
import X.AnonymousClass8BX;
import X.AnonymousClass99C;
import X.C003401n;
import X.C139576z4;
import X.C17880vN;
import X.C17890vO;
import X.C18030ve;
import X.C18070vi;
import X.C187499fu;
import X.C192319oA;
import X.C20319AGb;
import X.C21014Ad6;
import X.C21428Ajv;
import X.C33641j9;
import X.C33841jT;
import X.C36401np;
import X.C56462hV;
import X.C57352iw;
import X.C58712l8;
import X.C72453Mb;
import X.C72463Mc;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.WaTextView;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.textlayout.WDSTextLayout;

public final class PrimaryFlashCallEducationScreen extends AnonymousClass99C {
    public C56462hV A00;
    public C139576z4 A01;
    public AnonymousClass1LU A02;
    public C33841jT A03;
    public C33641j9 A04;
    public C21014Ad6 A05;
    public C57352iw A06;
    public C192319oA A07;
    public WDSTextLayout A08;
    public AnonymousClass00H A09;
    public AnonymousClass00H A0A;
    public AnonymousClass00H A0B;
    public AnonymousClass00H A0C;
    public boolean A0D;
    public int A0E = -1;
    public boolean A0F;

    private final SpannableString A10(Typeface typeface, String str) {
        TypefaceSpan typefaceSpan;
        Spanned fromHtml = Html.fromHtml(str);
        C18070vi.A0X(fromHtml);
        String obj = fromHtml.toString();
        SpannableString spannableString = new SpannableString(obj);
        Object[] spans = fromHtml.getSpans(0, obj.length(), Object.class);
        C18070vi.A0X(spans);
        for (Object obj2 : spans) {
            int spanStart = fromHtml.getSpanStart(obj2);
            int spanEnd = fromHtml.getSpanEnd(obj2);
            int spanFlags = fromHtml.getSpanFlags(obj2);
            if (Build.VERSION.SDK_INT >= 28) {
                typefaceSpan = new TypefaceSpan(typeface);
            } else {
                typefaceSpan = new TypefaceSpan("sans-serif-medium");
            }
            spannableString.setSpan(typefaceSpan, spanStart, spanEnd, spanFlags);
            spannableString.setSpan(new ForegroundColorSpan(AnonymousClass3Ma.A00(this, 2130969912, 2131101049)), spanStart, spanEnd, spanFlags);
        }
        return spannableString;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1 || i == 2) {
            C21014Ad6 ad6 = this.A05;
            if (ad6 != null) {
                String str = "granted";
                if (i == 2) {
                    C21014Ad6.A01(ad6);
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("DynamicBottomSheetNavigator/activity-result/request-flash-call-permissions/");
                    if (i2 != -1) {
                        str = "denied";
                    }
                    C17890vO.A1A(A10, str);
                    if (i2 == -1) {
                        C21014Ad6.A02(ad6);
                        return;
                    } else {
                        ad6.A0F.A00("flash");
                        ad6.A0B.A1b("primary_eligible");
                    }
                } else {
                    StringBuilder A102 = AnonymousClass000.A10();
                    A102.append("DynamicBottomSheetNavigator/activity-result/request-sms-permissions/");
                    if (i2 != -1) {
                        str = "denied";
                    }
                    C17890vO.A1A(A102, str);
                }
                C21014Ad6.A03(ad6);
                return;
            }
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C18070vi.A0d(menu, 0);
        menu.add(0, 0, 0, 2131895081);
        return super.onCreateOptionsMenu(menu);
    }

    public void onBackPressed() {
        String str;
        Intent intent;
        AnonymousClass00H r0 = this.A0A;
        if (r0 != null) {
            AnonymousClass8BR.A0q(r0).A0I("flash_call_education", "back");
            AnonymousClass00H r02 = this.A09;
            if (r02 != null) {
                if (C17880vN.A0I(r02).A0J(this.A0F)) {
                    Log.i("PrimaryFlashCallEducationScreen/onBackPressed/is adding new account");
                    AnonymousClass00H r03 = this.A09;
                    if (r03 != null) {
                        A9B.A0S(this, r03);
                        return;
                    }
                } else {
                    if (this.A0F) {
                        Log.i("PrimaryFlashCallEducationScreen/back-pressed/go-to-change-number-screen");
                        C33841jT r1 = this.A03;
                        if (r1 != null) {
                            C33841jT.A03(r1, 3, true);
                            C33841jT r04 = this.A03;
                            if (r04 != null) {
                                if (!r04.A0F()) {
                                    finish();
                                    return;
                                }
                                if (this.A02 != null) {
                                    intent = AnonymousClass8BX.A0A(this);
                                }
                                str = "waIntents";
                                C18070vi.A11(str);
                                throw null;
                            }
                        }
                        str = "registrationManager";
                        C18070vi.A11(str);
                        throw null;
                    }
                    Log.i("PrimaryFlashCallEducationScreen/back-pressed/go-to-register-phone-screen");
                    C139576z4 r12 = this.A01;
                    if (r12 != null) {
                        if (r12.A02(11568)) {
                            AnonymousClass00H r05 = this.A0A;
                            if (r05 != null) {
                                AnonymousClass8BR.A0q(r05).A0B("flash_call_education");
                            }
                        }
                        C33841jT r06 = this.A03;
                        if (r06 != null) {
                            C33841jT.A03(r06, 1, true);
                            if (this.A02 != null) {
                                intent = AnonymousClass1LU.A04(this);
                                C18070vi.A0X(intent);
                                intent.putExtra("com.whatsapp.registration.RegisterPhone.phone_number", this.A0A.A0n());
                                intent.putExtra("com.whatsapp.registration.RegisterPhone.country_code", this.A0A.A0l());
                                intent.putExtra("should_show_dbs_on_back_pressed", getIntent().getBooleanExtra("should_show_dbs_on_back_pressed", false));
                            }
                            str = "waIntents";
                            C18070vi.A11(str);
                            throw null;
                        }
                        str = "registrationManager";
                        C18070vi.A11(str);
                        throw null;
                    }
                    str = "abOfflineProps";
                    C18070vi.A11(str);
                    throw null;
                    A3q(intent, true);
                    return;
                }
            }
            str = "accountSwitcher";
            C18070vi.A11(str);
            throw null;
        }
        str = "funnelLogger";
        C18070vi.A11(str);
        throw null;
    }

    public void onCreate(Bundle bundle) {
        String str;
        C20319AGb aGb;
        String str2;
        super.onCreate(bundle);
        setContentView(2131626588);
        C57352iw r0 = this.A06;
        if (r0 != null) {
            r0.A00(this);
            C72463Mc.A0t(this);
            C17880vN.A1F(AnonymousClass8BV.A06(this.A0A.A00), "pref_flash_call_education_screen_displayed", true);
            if (AnonymousClass3MY.A09(this) != null) {
                this.A0E = getIntent().getIntExtra("flash_type", -1);
                getIntent().getLongExtra("sms_retry_time", 0);
                getIntent().getLongExtra("voice_retry_time", 0);
                this.A0F = getIntent().getBooleanExtra("change_number", false);
                this.A0D = getIntent().getBooleanExtra("use_silent_auth_fallback", false);
            }
            View view = this.A00;
            AnonymousClass00H r02 = this.A09;
            if (r02 != null) {
                A9B.A0Q(view, this, 2131436720, false, true, C17880vN.A0I(r02).A0J(this.A0F));
                this.A08 = (WDSTextLayout) C18070vi.A05(this.A00, 2131434060);
                C003401n supportActionBar = getSupportActionBar();
                if (supportActionBar != null) {
                    supportActionBar.A0Y(false);
                }
                C56462hV r3 = this.A00;
                if (r3 != null) {
                    this.A05 = r3.A00(this, this.A0E, false);
                    WDSTextLayout wDSTextLayout = this.A08;
                    if (wDSTextLayout == null) {
                        C18070vi.A11("textLayout");
                        throw null;
                    }
                    wDSTextLayout.setHeadlineText(getString(2131890430));
                    View inflate = View.inflate(this, 2131626587, (ViewGroup) null);
                    Typeface createFromAsset = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Medium.ttf");
                    TextView A0E2 = C17880vN.A0E(inflate, 2131432253);
                    String A0F2 = C18070vi.A0F(this, 2131891842);
                    C18070vi.A0b(createFromAsset);
                    A0E2.setText(A10(createFromAsset, A0F2));
                    C17880vN.A0E(inflate, 2131427375).setText(A10(createFromAsset, C18070vi.A0F(this, 2131886183)));
                    AnonymousClass00H r03 = this.A0B;
                    if (r03 != null) {
                        C187499fu r6 = (C187499fu) r03.get();
                        WaTextView A0g = C72453Mb.A0g(inflate, 2131430902);
                        C18070vi.A0d(A0g, 1);
                        C18030ve r14 = r6.A02;
                        C36401np r15 = r6.A03;
                        String string = getString(2131891596);
                        A9B.A0N(this, this, A0g, AnonymousClass3MW.A0a(r6.A04), r6.A00, r14, r15, new C21428Ajv(r6, 15), "flash-call-faq-link", string, "flash-call-faq-android");
                        WDSTextLayout wDSTextLayout2 = this.A08;
                        if (wDSTextLayout2 == null) {
                            C18070vi.A11("textLayout");
                            throw null;
                        }
                        wDSTextLayout2.setContent(new AnonymousClass4CG(inflate));
                        WDSTextLayout wDSTextLayout3 = this.A08;
                        if (wDSTextLayout3 != null) {
                            wDSTextLayout3.setPrimaryButtonText(getString(2131897825));
                            WDSTextLayout wDSTextLayout4 = this.A08;
                            if (wDSTextLayout4 != null) {
                                wDSTextLayout4.setPrimaryButtonClickListener(new AFS(this, 26));
                                WDSTextLayout wDSTextLayout5 = this.A08;
                                if (wDSTextLayout5 != null) {
                                    wDSTextLayout5.setSecondaryButtonText(getString(2131897757));
                                    WDSTextLayout wDSTextLayout6 = this.A08;
                                    if (wDSTextLayout6 != null) {
                                        wDSTextLayout6.setSecondaryButtonClickListener(new AFS(this, 27));
                                        C192319oA r04 = this.A07;
                                        if (r04 != null) {
                                            boolean A012 = r04.A01();
                                            AnonymousClass1GP supportFragmentManager = getSupportFragmentManager();
                                            if (A012) {
                                                aGb = new C20319AGb(this, 2);
                                                str2 = "REQUEST_SERVER_DRIVEN_OTP_FRAGMENT_RESULT";
                                            } else {
                                                aGb = new C20319AGb(this, 3);
                                                str2 = "VERIFY_ANOTHER_WAY_FRAGMENT_RESULT";
                                            }
                                            supportFragmentManager.A0t(aGb, this, str2);
                                            if (this.A0A.A0A() == -1) {
                                                C17880vN.A1C(C72453Mb.A0M(this).edit(), "pref_flash_call_education_link_clicked", 0);
                                            }
                                            AnonymousClass00H r05 = this.A0A;
                                            if (r05 != null) {
                                                AnonymousClass8BR.A0q(r05).A0C("flash_call_education");
                                                return;
                                            }
                                            str = "funnelLogger";
                                        } else {
                                            C18070vi.A11("serverDrivenOtpManager");
                                            throw null;
                                        }
                                    }
                                }
                                C18070vi.A11("textLayout");
                                throw null;
                            }
                        }
                        C18070vi.A11("textLayout");
                        throw null;
                    }
                    C18070vi.A11("primaryFlashCallUtils");
                    throw null;
                }
                str = "dynamicBottomSheetNavigatorFactory";
            } else {
                str = "accountSwitcher";
            }
        } else {
            str = "landscapeModeBacktest";
        }
        C18070vi.A11(str);
        throw null;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        String str;
        int A0B2 = C72453Mb.A0B(menuItem);
        if (A0B2 == 0) {
            Log.i("PrimaryFlashCallEducationScreen/select-menu-option/help");
            AnonymousClass00H r0 = this.A0C;
            if (r0 != null) {
                C58712l8 r2 = (C58712l8) r0.get();
                C33641j9 r1 = this.A04;
                if (r1 != null) {
                    r2.A01(this, r1, "verify-flash-call");
                    return true;
                }
                str = "verificationFlowState";
            } else {
                str = "registrationHelper";
            }
        } else if (A0B2 != 1) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            Log.i("PrimaryFlashCallEducationScreen/select-menu-option/reset");
            C33841jT r02 = this.A03;
            if (r02 != null) {
                r02.A0A();
                if (this.A02 != null) {
                    startActivity(AnonymousClass1LU.A01(this));
                    finishAffinity();
                    return true;
                }
                str = "waIntents";
            } else {
                str = "registrationManager";
            }
        }
        C18070vi.A11(str);
        throw null;
    }
}
