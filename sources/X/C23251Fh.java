package X;

import android.animation.LayoutTransition;
import android.app.Dialog;
import android.app.assist.AssistContent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.whatsapp.ConversationFragment;
import com.whatsapp.home.ui.HomePlaceholderActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.picker.search.PickerSearchDialogFragment;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1Fh  reason: invalid class name and case insensitive filesystem */
public abstract class C23251Fh extends AnonymousClass1FZ implements C23181Fa, C23191Fb, C23201Fc, C23211Fd, C23221Fe, C23231Ff, C23241Fg {
    public int A00 = -1;
    public int A01 = -1;
    public int A02 = 0;
    public Point A03;
    public View A04;
    public C23271Fj A05;
    public AnonymousClass17T A06;
    public AnonymousClass00H A07;
    public boolean A08 = false;
    public boolean A09 = false;
    public Intent A0A;
    public View A0B;
    public C132916nr A0C;
    public final AnonymousClass1GV A0D = new C64892vV(this, 6);

    private void A03() {
        View view;
        Resources resources;
        int i;
        this.A03 = null;
        int i2 = this.A01;
        if (i2 != -1 && (view = this.A04) != null) {
            View findViewById = view.findViewById(i2);
            View findViewById2 = this.A04.findViewById(this.A00);
            double A012 = (double) AnonymousClass1ZO.A01(this);
            double A002 = (double) AnonymousClass1ZO.A00(this);
            boolean z = false;
            if (Math.max(A012, A002) / Math.min(A012, A002) >= 1.45d) {
                z = true;
            }
            if ((findViewById instanceof LinearLayout) && (findViewById2 instanceof LinearLayout)) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) findViewById.getLayoutParams();
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) findViewById2.getLayoutParams();
                Resources resources2 = getResources();
                if (z) {
                    layoutParams.weight = (float) resources2.getInteger(2131492933);
                    resources = getResources();
                    i = 2131492932;
                } else {
                    layoutParams.weight = (float) resources2.getInteger(2131492938);
                    resources = getResources();
                    i = 2131492937;
                }
                layoutParams2.weight = (float) resources.getInteger(i);
                findViewById.setLayoutParams(layoutParams);
                findViewById2.setLayoutParams(layoutParams2);
            }
        }
    }

    public static void A0Q(C23251Fh r3) {
        View view;
        if (((C24001Il) r3.A07.get()).A0A() && (view = r3.A04) != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new C90584eJ((Object) r3, 2));
        }
    }

    public static void A0V(C23251Fh r4, int i) {
        View findViewById;
        View view = r4.A04;
        if (view != null && (findViewById = view.findViewById(r4.A01)) != null) {
            ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.addTransitionListener(new C64082uC(viewGroup, r4));
            viewGroup.setLayoutTransition(layoutTransition);
            findViewById.setVisibility(i);
        }
    }

    public ConversationFragment A4b() {
        return (ConversationFragment) this.A03.A00.A03.A0Q("com.whatsapp.HomeActivity.ConversationFragment");
    }

    public void A4c() {
        Fragment A0Q;
        AnonymousClass1GP r2 = this.A03.A00.A03;
        if (!isFinishing() && !r2.A0F && !r2.A0z() && (A0Q = r2.A0Q("com.whatsapp.HomeActivity.ConversationFragment")) != null) {
            C34001jj r0 = new C34001jj(r2);
            r0.A07(A0Q);
            r0.A03();
        }
    }

    public void A4d() {
        ViewGroup viewGroup;
        View view;
        View view2 = this.A00;
        if (view2 != null && (viewGroup = (ViewGroup) view2.findViewById(this.A00)) != null && (view = this.A0B) != null) {
            viewGroup.removeView(view);
            if (this.A0B instanceof C218317o) {
                getLifecycle().A06((C218317o) this.A0B);
            }
            this.A0B = null;
        }
    }

    public void A4e() {
        View findViewById;
        boolean A072 = ((C24001Il) this.A07.get()).A07();
        View view = this.A04;
        if (view != null && A072 && (findViewById = view.findViewById(this.A00)) != null) {
            A4f();
            findViewById.setVisibility(0);
            A03();
            A0Q(this);
        }
    }

    public void A4f() {
        View view;
        ViewGroup viewGroup;
        if (((C24001Il) this.A07.get()).A07() && (view = this.A04) != null && this.A05 != null && (viewGroup = (ViewGroup) view.findViewById(this.A00)) != null) {
            View view2 = this.A0B;
            if (view2 == null || !view2.isAttachedToWindow()) {
                this.A0B = new HomePlaceholderActivity.HomePlaceholderView((Context) this.A05, (AttributeSet) null);
            }
            View view3 = this.A0B;
            if (view3 != null) {
                view3.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                viewGroup.setBackgroundResource(AnonymousClass1YL.A00(this, 2130971997, 2131103198));
                if (this.A0B.getParent() instanceof ViewGroup) {
                    ((ViewGroup) this.A0B.getParent()).removeView(this.A0B);
                }
                viewGroup.addView(this.A0B);
                if (this.A0B instanceof C218317o) {
                    getLifecycle().A05((C218317o) this.A0B);
                }
            }
        }
    }

    public Point BPP() {
        View findViewById;
        Point point = this.A03;
        if (point != null) {
            return point;
        }
        View view = this.A04;
        if (!(view == null || (findViewById = view.findViewById(this.A00)) == null)) {
            this.A03 = new Point(findViewById.getWidth(), findViewById.getHeight());
        }
        return this.A03;
    }

    public void BhJ(Intent intent) {
        if (((C24001Il) this.A07.get()).A07()) {
            C132916nr r4 = this.A0C;
            if (r4 == null) {
                r4 = new C132916nr(this.A05, TimeUnit.MILLISECONDS, 500);
                this.A0C = r4;
            }
            r4.A00 = new C99134sK(intent, this, 0);
            r4.A00();
            return;
        }
        startActivity(intent);
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        C24001Il r2 = (C24001Il) this.A07.get();
        if (r2.A0A()) {
            r2.notifyAllObservers(new C96994ok(21));
        }
        return super.onPrepareOptionsMenu(menu);
    }

    public void A2p() {
        C78843tk r0;
        if (A4b() != null && (r0 = A4b().A02) != null) {
            r0.A01.A00();
        }
    }

    public void A35() {
        C78843tk r0;
        if (A4b() != null && (r0 = A4b().A02) != null) {
            r0.A04.A2Y();
        }
    }

    public void A3h(int i) {
        C78843tk r0;
        if (A4b() != null && (r0 = A4b().A02) != null) {
            AnonymousClass4aY r1 = r0.A04;
            AnonymousClass3T0 r02 = r1.A1X;
            if (r02 != null) {
                r02.A00.A00();
            }
            AnonymousClass8F7 r03 = r1.A1c;
            if (r03 != null) {
                r03.A0V();
            }
        }
    }

    public void A4D() {
        if (A4b() != null) {
            A4c();
            A4f();
            C24001Il r2 = (C24001Il) this.A07.get();
            if (r2.A0A()) {
                r2.notifyAllObservers(new C96994ok(22));
                return;
            }
            return;
        }
        super.A4D();
    }

    public void BBm(AnonymousClass1E7 r2, AnonymousClass1BI r3) {
        if (A4b() != null) {
            A4b().BBm(r2, r3);
        }
    }

    public void Bl8(UserJid userJid, boolean z) {
        if (A4b() != null) {
            A4b().Bl8(userJid, z);
        }
    }

    public void Bln() {
        if (A4b() != null) {
            A4b().Bln();
        }
    }

    public void Bpu(AnonymousClass1BI r2, int i) {
        C78843tk r0;
        if (A4b() != null && (r0 = A4b().A02) != null) {
            r0.A04.A2y(r2, i);
        }
    }

    public void BqW(UserJid userJid, boolean z) {
        if (A4b() != null) {
            A4b().BqW(userJid, z);
        }
    }

    public void C0a(PickerSearchDialogFragment pickerSearchDialogFragment) {
        if (A4b() != null) {
            A4b().C0a(pickerSearchDialogFragment);
        }
    }

    public void C81(AnonymousClass02B r3) {
        C78843tk r1;
        super.C81(r3);
        if (A4b() != null && (r1 = A4b().A02) != null) {
            r1.A00.A0A();
            AnonymousClass17U r0 = (AnonymousClass17U) r1.A04.A1s;
            r0.A02 = false;
            AnonymousClass3M7 r02 = r0.A00;
            if (r02 != null) {
                r02.setShouldHideBanner(false);
            }
        }
    }

    public void C82(AnonymousClass02B r3) {
        C78843tk r1;
        super.C82(r3);
        if (A4b() != null && (r1 = A4b().A02) != null) {
            r1.A00.A0B();
            AnonymousClass17U r0 = (AnonymousClass17U) r1.A04.A1s;
            r0.A02 = true;
            AnonymousClass3M7 r02 = r0.A00;
            if (r02 != null) {
                r02.setShouldHideBanner(true);
            }
        }
    }

    public void C9u() {
        if (A4b() != null) {
            A4b().C9u();
        }
    }

    public void CMj(DialogFragment dialogFragment) {
        if (A4b() != null) {
            A4b().CMj(dialogFragment);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (A4b() != null) {
            A4b().A1w(i, i2, intent);
        }
    }

    public void onBackPressed() {
        if (A4b() != null) {
            C78843tk r0 = A4b().A02;
            if (r0 != null) {
                r0.A04.A2V();
                return;
            }
            return;
        }
        super.onBackPressed();
    }

    public void onConfigurationChanged(Configuration configuration) {
        Intent intent;
        super.onConfigurationChanged(configuration);
        ((C24001Il) this.A07.get()).A03(this);
        boolean A072 = ((C24001Il) this.A07.get()).A07();
        int i = configuration.screenWidthDp;
        if (i != this.A02) {
            this.A02 = i;
            if (A072 != this.A08) {
                this.A08 = A072;
                if (A072) {
                    A4e();
                } else {
                    Fragment A0Q = this.A03.A00.A03.A0Q("com.whatsapp.HomeActivity.ConversationFragment");
                    if (A0Q == null || !A0Q.A1e()) {
                        intent = null;
                    } else {
                        this.A07.get();
                        Intent intent2 = getIntent();
                        C18070vi.A0d(intent2, 1);
                        intent = AnonymousClass1LU.A0C(this, 0);
                        C18070vi.A0X(intent);
                        intent.setData(intent2.getData());
                        intent.putExtras(intent2);
                    }
                    this.A03 = null;
                    View view = this.A04;
                    if (view != null) {
                        View findViewById = view.findViewById(this.A00);
                        if (findViewById != null) {
                            A4c();
                            A4d();
                            C24001Il r2 = (C24001Il) this.A07.get();
                            r2.A0A();
                            r2.notifyAllObservers(new C96994ok(22));
                            findViewById.setVisibility(8);
                        }
                        A0Q(this);
                    }
                    if (intent != null) {
                        startActivity(intent);
                    }
                }
            }
        }
        if (this.A08) {
            A03();
        }
    }

    public void onContentChanged() {
        C78843tk r0;
        super.onContentChanged();
        if (A4b() != null && (r0 = A4b().A02) != null) {
            C74813cq.A00(r0);
            r0.A01.A00();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A0A = getIntent();
    }

    public Dialog onCreateDialog(int i) {
        if (A4b() == null) {
            return super.onCreateDialog(i);
        }
        return A4b().A02.A04.A2I(i);
    }

    public void onDestroy() {
        super.onDestroy();
        Intent intent = this.A0A;
        if (intent != null) {
            setIntent(intent);
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (A4b() == null) {
            return super.onKeyDown(i, keyEvent);
        }
        C78843tk r0 = A4b().A02;
        if (r0 != null) {
            return r0.onKeyDown(i, keyEvent);
        }
        return true;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (A4b() == null) {
            return super.onKeyUp(i, keyEvent);
        }
        C78843tk r0 = A4b().A02;
        if (r0 != null) {
            return r0.onKeyUp(i, keyEvent);
        }
        return true;
    }

    public void onProvideAssistContent(AssistContent assistContent) {
        super.onProvideAssistContent(assistContent);
        if (A4b() != null) {
            A4b().A26(assistContent);
        }
    }

    public void onRestart() {
        C78843tk r0;
        if (!(A4b() == null || (r0 = A4b().A02) == null)) {
            r0.A04.A2a();
        }
        super.onRestart();
    }

    public void onResume() {
        boolean z;
        View findViewById;
        super.onResume();
        if (((C24001Il) this.A07.get()).A09()) {
            boolean z2 = this.A0B.A00.getBoolean("otp_split_mode_user_choice", true);
            boolean z3 = true;
            if (this.A09) {
                z = true;
            } else {
                View view = this.A04;
                z = false;
                if (!(view == null || (findViewById = view.findViewById(this.A00)) == null)) {
                    if (findViewById.getVisibility() != 0) {
                        z3 = false;
                    }
                    z = z3;
                }
            }
            if (z2 != z) {
                Intent A022 = AnonymousClass1LU.A02(this);
                A022.addFlags(268468224);
                startActivity(A022);
                overridePendingTransition(2130772021, 2130772022);
            }
        }
    }

    public void onStart() {
        super.onStart();
        ((C24001Il) this.A07.get()).A04(this, this.A0D);
    }

    public void onStop() {
        super.onStop();
        ((C24001Il) this.A07.get()).A05(this.A0D);
    }

    public void setRequestedOrientation(int i) {
        super.setRequestedOrientation(i);
    }
}
