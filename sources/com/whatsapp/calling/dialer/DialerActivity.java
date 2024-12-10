package com.whatsapp.calling.dialer;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass112;
import X.AnonymousClass1BI;
import X.AnonymousClass1D6;
import X.AnonymousClass1E7;
import X.AnonymousClass1GP;
import X.AnonymousClass1V9;
import X.AnonymousClass1Y5;
import X.AnonymousClass1ZU;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4aX;
import X.AnonymousClass5DT;
import X.AnonymousClass5DU;
import X.AnonymousClass5MN;
import X.AnonymousClass5W4;
import X.C003401n;
import X.C105135Qv;
import X.C105145Qw;
import X.C18070vi;
import X.C18100vl;
import X.C195199sx;
import X.C219217x;
import X.C30191dX;
import X.C30391dr;
import X.C36451nu;
import X.C41561wd;
import X.C72453Mb;
import X.C72463Mc;
import X.C72483Me;
import X.C73173Rg;
import X.C74743cP;
import X.C75293eK;
import X.C88084Yg;
import X.C89624cl;
import X.C90034dQ;
import X.C90104dX;
import X.C90274do;
import X.C90314ds;
import X.C90334du;
import X.C91374fa;
import X.C99274sY;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.ToneGenerator;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.topbar.WDSToolbar;
import java.util.ArrayList;
import java.util.Iterator;

public final class DialerActivity extends C75293eK {
    public static final ArrayList A0I = AnonymousClass1ZU.A05(C75293eK.A03(2131437100, '0'), C75293eK.A03(2131433281, '1'), C75293eK.A03(2131436468, '2'), C75293eK.A03(2131436121, '3'), C75293eK.A03(2131430993, '4'), C75293eK.A03(2131430891, '5'), C75293eK.A03(2131435467, '6'), C75293eK.A03(2131435336, '7'), C75293eK.A03(2131430277, '8'), C75293eK.A03(2131433127, '9'), C75293eK.A03(2131435570, '*'), C75293eK.A03(2131434013, '#'));
    public static final ArrayList A0J;
    public ToneGenerator A00;
    public ActionMode.Callback A01;
    public ActionMode A02;
    public ImageView A03;
    public ImageView A04;
    public ImageView A05;
    public ShimmerFrameLayout A06;
    public TextEmojiLabel A07;
    public DialerNumberView A08;
    public AnonymousClass1V9 A09;
    public C195199sx A0A;
    public C30191dX A0B;
    public C219217x A0C;
    public WDSToolbar A0D;
    public AnonymousClass00H A0E;
    public AnonymousClass00H A0F;
    public AnonymousClass00H A0G;
    public final C18100vl A0H = C99274sY.A00(new AnonymousClass5DU(this), new AnonymousClass5DT(this), new AnonymousClass5MN(this), AnonymousClass3MW.A15(DialerViewModel.class));

    private final void A0d(boolean z) {
        String str;
        AnonymousClass1BI A002;
        AnonymousClass1V9 r3 = this.A09;
        if (r3 != null) {
            r3.A01(14, 57, 15);
            AnonymousClass00H r0 = this.A0F;
            if (r0 != null) {
                C36451nu r7 = (C36451nu) r0.get();
                boolean z2 = z;
                if (!z || !AnonymousClass3Ma.A1Y(r7)) {
                    try {
                        C18100vl r1 = this.A0H;
                        String str2 = ((C88084Yg) ((DialerViewModel) r1.getValue()).A0K.getValue()).A06;
                        if (str2 == null) {
                            str2 = "";
                        }
                        Intent A003 = C36451nu.A00(r7, str2, ((C88084Yg) ((DialerViewModel) r1.getValue()).A0K.getValue()).A04, z2, false);
                        A003.putExtra("finishActivityOnSaveCompleted", true);
                        startActivityForResult(A003, C72453Mb.A04(z2 ? 1 : 0));
                    } catch (ActivityNotFoundException | SecurityException e) {
                        Log.w("dialer/opt system contact list could not found", e);
                        CMx((Integer) null, 2131886448, 2131899286, (Integer) null, (Integer) null, "dialer/dialog-activity-not-found", (String) null, (Object[]) null);
                        return;
                    }
                } else {
                    C18100vl r2 = this.A0H;
                    String str3 = ((C88084Yg) ((DialerViewModel) r2.getValue()).A0K.getValue()).A06;
                    AnonymousClass1E7 r4 = ((C88084Yg) ((DialerViewModel) r2.getValue()).A0K.getValue()).A01;
                    if (r4 != null && (A002 = AnonymousClass1E7.A00(r4)) != null) {
                        AnonymousClass1GP supportFragmentManager = getSupportFragmentManager();
                        C219217x r22 = this.A0C;
                        if (r22 != null) {
                            C30191dX r12 = this.A0B;
                            if (r12 != null) {
                                r7.A05(this, supportFragmentManager, r12, r22, this.A0A, r4, A002);
                            } else {
                                C18070vi.A11("contactAccessHelper");
                            }
                        } else {
                            C18070vi.A11("waPermissionsHelper");
                        }
                        throw null;
                    } else if (str3 != null) {
                        r7.A07(getSupportFragmentManager(), str3);
                    }
                    getSupportFragmentManager().A0t(new C91374fa(this, 3), this, "request_bottom_sheet_fragment");
                }
                AnonymousClass00H r02 = this.A0E;
                if (r02 != null) {
                    AnonymousClass3MW.A0m(r02).A06(true, 19);
                    return;
                } else {
                    C18070vi.A11("addContactLogUtilLazy");
                    throw null;
                }
            } else {
                str = "addToContactsUtilLazy";
            }
        } else {
            str = "callUserJourneyLogger";
        }
        C18070vi.A11(str);
        throw null;
    }

    public void BkF(String str) {
        C18070vi.A0d(str, 0);
        if (str.equals("dialer/dialog-add-contact")) {
            A0d(false);
        }
    }

    public void CBt(String str) {
        C18070vi.A0d(str, 0);
        if (str.equals("dialer/dialog-add-contact")) {
            A0d(true);
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C18070vi.A0d(motionEvent, 0);
        if (this.A02 == null || motionEvent.getAction() != 0) {
            return super.dispatchTouchEvent(motionEvent);
        }
        ActionMode actionMode = this.A02;
        if (actionMode != null) {
            actionMode.finish();
        }
        return false;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1 && i != 2) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            DialerViewModel A0X = AnonymousClass3MZ.A0X(this);
            AnonymousClass3MW.A1X(A0X.A0E, new DialerViewModel$syncContacts$1(A0X, (C30391dr) null), C41561wd.A00(A0X));
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C18070vi.A0d(menu, 0);
        getMenuInflater().inflate(2131820560, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        this.A02 = null;
        super.onDestroy();
        ToneGenerator toneGenerator = this.A00;
        if (toneGenerator == null) {
            C18070vi.A11("toneGenerator");
            throw null;
        } else {
            toneGenerator.release();
        }
    }

    static {
        AnonymousClass1D6[] r3 = new AnonymousClass1D6[12];
        C72483Me.A18(2131437100, 2131433281, r3, 0, 1);
        C72483Me.A18(2131436468, 2131436121, r3, 2, 3);
        C72483Me.A18(2131430993, 2131430891, r3, 4, 5);
        C72483Me.A18(2131435467, 2131435336, r3, 6, 7);
        C72483Me.A18(2131430277, 2131433127, r3, 8, 9);
        C72483Me.A18(2131435570, 2131434013, r3, 10, 11);
        A0J = AnonymousClass1ZU.A05(r3);
    }

    public static final void A0V(DialerActivity dialerActivity) {
        ActionMode.Callback callback = dialerActivity.A01;
        if (callback == null) {
            C18070vi.A11("actionModeCallback");
            throw null;
        } else {
            dialerActivity.A02 = dialerActivity.startActionMode(callback, 1);
        }
    }

    public static final void A0c(DialerActivity dialerActivity, boolean z) {
        ShimmerFrameLayout shimmerFrameLayout;
        int i;
        TextEmojiLabel textEmojiLabel = dialerActivity.A07;
        if (textEmojiLabel == null) {
            C18070vi.A11("numberDetailsTextView");
            throw null;
        }
        textEmojiLabel.setText((CharSequence) null);
        TextEmojiLabel textEmojiLabel2 = dialerActivity.A07;
        if (textEmojiLabel2 == null) {
            C18070vi.A11("numberDetailsTextView");
            throw null;
        }
        textEmojiLabel2.A0N();
        TextEmojiLabel textEmojiLabel3 = dialerActivity.A07;
        if (textEmojiLabel3 == null) {
            C18070vi.A11("numberDetailsTextView");
            throw null;
        }
        textEmojiLabel3.setVisibility(4);
        ShimmerFrameLayout shimmerFrameLayout2 = dialerActivity.A06;
        if (z) {
            if (shimmerFrameLayout2 != null) {
                shimmerFrameLayout2.A02();
                shimmerFrameLayout = dialerActivity.A06;
                if (shimmerFrameLayout != null) {
                    i = 0;
                }
            }
            C18070vi.A11("numberDetailsShimmer");
            throw null;
        }
        if (shimmerFrameLayout2 != null) {
            shimmerFrameLayout2.A01();
            shimmerFrameLayout = dialerActivity.A06;
            if (shimmerFrameLayout != null) {
                i = 8;
            }
        }
        C18070vi.A11("numberDetailsShimmer");
        throw null;
        shimmerFrameLayout.setVisibility(i);
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        if (menu != null) {
            menu.setGroupVisible(2131429974, C72463Mc.A1a(AnonymousClass3MZ.A0X(this).A0I));
        }
        return super.onPrepareOptionsMenu(menu);
    }

    public static final void A0Q(Bundle bundle, DialerActivity dialerActivity, String str) {
        C18070vi.A0j(str, bundle);
        if (str.equals("request_bottom_sheet_fragment") && bundle.getBoolean("is_contact_saved")) {
            DialerViewModel A0X = AnonymousClass3MZ.A0X(dialerActivity);
            AnonymousClass3MW.A1X(A0X.A0E, new DialerViewModel$syncContacts$1(A0X, (C30391dr) null), C41561wd.A00(A0X));
        }
        dialerActivity.getSupportFragmentManager().A0u("request_bottom_sheet_fragment");
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setContentView(2131625087);
        this.A08 = (DialerNumberView) C18070vi.A05(this.A00, 2131429971);
        this.A04 = AnonymousClass3Ma.A0C(this.A00, 2131429121);
        this.A05 = AnonymousClass3Ma.A0C(this.A00, 2131432677);
        TextEmojiLabel A0c = C72453Mb.A0c(this.A00, 2131429975);
        this.A07 = A0c;
        if (A0c == null) {
            str = "numberDetailsTextView";
        } else {
            A0c.setAccessibilityLiveRegion(1);
            this.A06 = (ShimmerFrameLayout) C18070vi.A05(this.A00, 2131429976);
            this.A03 = AnonymousClass3Ma.A0C(this.A00, 2131428639);
            this.A0D = (WDSToolbar) AnonymousClass3MY.A0H(this, 2131436246);
            this.A00 = new ToneGenerator(8, 80);
            WDSToolbar wDSToolbar = this.A0D;
            if (wDSToolbar == null) {
                str = "wdsToolBar";
            } else {
                wDSToolbar.setNavigationIcon((Drawable) new C74743cP(AnonymousClass4aX.A03(this, 2130970284, 2131101275, 2131231675), this.A00));
                wDSToolbar.setElevation(0.0f);
                C003401n A0K = AnonymousClass3MY.A0K(this, wDSToolbar);
                if (A0K != null) {
                    A0K.A0Y(false);
                }
                wDSToolbar.setNavigationOnClickListener(new C90034dQ(this, 15));
                BVe().A09(new C73173Rg(this, 2), this);
                Iterator it = A0I.iterator();
                while (it.hasNext()) {
                    AnonymousClass1D6 r0 = (AnonymousClass1D6) it.next();
                    int A042 = AnonymousClass3MZ.A04(r0);
                    char charValue = ((Character) r0.second).charValue();
                    View A052 = C18070vi.A05(this.A00, A042);
                    C90104dX.A00(A052, this, charValue, 10);
                    A052.setOnTouchListener(new C90334du((Object) A052, 4));
                    if (A042 == 2131437100) {
                        C90274do.A00(A052, this, 9);
                        AnonymousClass1Y5.A05(A052, 2131889414);
                    }
                }
                Iterator it2 = A0J.iterator();
                while (it2.hasNext()) {
                    AnonymousClass1D6 r02 = (AnonymousClass1D6) it2.next();
                    int A043 = AnonymousClass3MZ.A04(r02);
                    int A0M = AnonymousClass000.A0M(r02.second);
                    DialpadKey dialpadKey = (DialpadKey) C18070vi.A05(this.A00, A043);
                    dialpadKey.setOnTouchListener(new C90314ds(this, dialpadKey, A0M));
                }
                ImageView imageView = this.A04;
                if (imageView == null) {
                    str = "clearNumberButton";
                } else {
                    C90034dQ.A01(imageView, this, 16);
                    C90274do.A00(imageView, this, 10);
                    imageView.setOnTouchListener(new C90334du((Object) imageView, 5));
                    ImageView imageView2 = this.A03;
                    String str2 = "callButton";
                    if (imageView2 != null) {
                        C90034dQ.A01(imageView2, this, 17);
                        ImageView imageView3 = this.A03;
                        if (imageView3 != null) {
                            C90334du.A00(imageView3, this, 6);
                            ImageView imageView4 = this.A05;
                            str2 = "messageNumberButton";
                            if (imageView4 != null) {
                                C90034dQ.A01(imageView4, this, 14);
                                ImageView imageView5 = this.A05;
                                if (imageView5 != null) {
                                    C90334du.A00(imageView5, this, 3);
                                    AnonymousClass3MX.A1Q(new DialerActivity$initObservables$1(this, (C30391dr) null), AnonymousClass3MZ.A0H(this));
                                    C18100vl r2 = this.A0H;
                                    AnonymousClass3MY.A1K(this, ((DialerViewModel) r2.getValue()).A02, new AnonymousClass5W4(this), 24);
                                    DialerViewModel dialerViewModel = (DialerViewModel) r2.getValue();
                                    AnonymousClass3MY.A1K(this, dialerViewModel.A01, new C105135Qv(this), 24);
                                    AnonymousClass3MY.A1K(this, dialerViewModel.A00, new C105145Qw(this), 24);
                                    if (AnonymousClass112.A01()) {
                                        this.A01 = new C89624cl(this, 2);
                                        DialerNumberView dialerNumberView = this.A08;
                                        str2 = "dialedNumberTextView";
                                        if (dialerNumberView != null) {
                                            C90274do.A00(dialerNumberView, this, 8);
                                            DialerNumberView dialerNumberView2 = this.A08;
                                            if (dialerNumberView2 != null) {
                                                AnonymousClass1Y5.A05(dialerNumberView2, 2131889409);
                                                return;
                                            }
                                        }
                                    } else {
                                        return;
                                    }
                                }
                            }
                        }
                    }
                    C18070vi.A11(str2);
                    throw null;
                }
            }
        }
        C18070vi.A11(str);
        throw null;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C72453Mb.A0B(menuItem) != 2131434789) {
            return super.onOptionsItemSelected(menuItem);
        }
        AnonymousClass00H r0 = this.A0G;
        if (r0 == null) {
            C18070vi.A11("nativeContactGateKeeperLazy");
            throw null;
        } else if (AnonymousClass3MX.A0g(r0).A05()) {
            A0d(true);
            return true;
        } else {
            CMx((Integer) null, 2131886468, 2131892464, 2131890163, (Integer) null, "dialer/dialog-add-contact", (String) null, (Object[]) null);
            return true;
        }
    }
}
