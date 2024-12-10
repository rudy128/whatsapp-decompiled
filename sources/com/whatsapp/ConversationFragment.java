package com.whatsapp;

import X.AnonymousClass01U;
import X.AnonymousClass1BI;
import X.AnonymousClass1E7;
import X.AnonymousClass1YL;
import X.AnonymousClass4aY;
import X.C003301m;
import X.C108185bH;
import X.C23201Fc;
import X.C23211Fd;
import X.C23221Fe;
import X.C23231Ff;
import X.C27080DTf;
import X.C64312uZ;
import X.C64832vP;
import X.C74813cq;
import X.C78843tk;
import X.C90584eJ;
import android.app.assist.AssistContent;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.picker.search.PickerSearchDialogFragment;
import java.lang.ref.WeakReference;
import java.util.List;

public class ConversationFragment extends Hilt_ConversationFragment implements C23201Fc, C23211Fd, C23221Fe, C23231Ff {
    public Bundle A00;
    public FrameLayout A01;
    public C78843tk A02;
    public final AnonymousClass01U A03 = new C64832vP(this);

    public static void A00(Menu menu, MenuItem.OnMenuItemClickListener onMenuItemClickListener, ConversationFragment conversationFragment) {
        for (int i = 0; i < menu.size(); i++) {
            MenuItem item = menu.getItem(i);
            item.setOnMenuItemClickListener(onMenuItemClickListener);
            if (item.getSubMenu() != null) {
                A00(item.getSubMenu(), onMenuItemClickListener, conversationFragment);
            }
        }
    }

    public void A1j() {
        this.A0X = true;
        C78843tk r0 = this.A02;
        if (r0 != null) {
            r0.A04.A2d();
        }
    }

    public void A1t() {
        this.A0X = true;
        C78843tk r1 = this.A02;
        if (r1 != null) {
            r1.A00.A09();
            r1.A04.A2Z();
        }
    }

    public void A1u() {
        this.A0X = true;
        C78843tk r0 = this.A02;
        if (r0 != null) {
            r0.A04.A2b();
        }
    }

    public void A1v() {
        this.A0X = true;
        C78843tk r3 = this.A02;
        if (r3 != null) {
            r3.A04.A2c();
            if (!r3.A0A) {
                Looper.myQueue().addIdleHandler(new C64312uZ(r3, new C27080DTf((Object) r3, 47)));
                r3.A0A = true;
            }
            Looper.myQueue().addIdleHandler(new C64312uZ(r3, new C27080DTf((Object) r3, 48)));
        }
    }

    public void A1r() {
        C78843tk r0 = this.A02;
        if (r0 != null) {
            Toolbar toolbar = r0.A04.A0f;
            if (toolbar != null) {
                Menu menu = toolbar.getMenu();
                for (int i = 0; i < menu.size(); i++) {
                    menu.getItem(i).setOnMenuItemClickListener((MenuItem.OnMenuItemClickListener) null);
                }
            }
            C78843tk r1 = this.A02;
            r1.A04.A2X();
            r1.A0C.clear();
            r1.A00.A08();
            r1.A01.clear();
        }
        this.A0X = true;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.view.MenuItem$OnMenuItemClickListener, X.2v8, java.lang.Object] */
    public void A22(Menu menu, MenuInflater menuInflater) {
        Toolbar toolbar;
        C78843tk r0 = this.A02;
        if (r0 != null && (toolbar = r0.A04.A0f) != null) {
            Menu menu2 = toolbar.getMenu();
            menu2.clear();
            AnonymousClass4aY r2 = this.A02.A04;
            for (C108185bH BqX : r2.A7q) {
                BqX.BqX(menu2);
            }
            r2.A2Q.C7s(menu2);
            C78843tk r22 = this.A02;
            ? obj = new Object();
            obj.A00 = new WeakReference(r22);
            A00(menu2, obj, this);
            if (menu2 instanceof C003301m) {
                ((C003301m) menu2).A0U(this.A03);
            }
        }
    }

    public void A26(AssistContent assistContent) {
        C78843tk r0 = this.A02;
        if (r0 != null) {
            r0.A03(assistContent);
        }
    }

    public void BBm(AnonymousClass1E7 r2, AnonymousClass1BI r3) {
        C78843tk r0 = this.A02;
        if (r0 != null) {
            r0.BBm(r2, r3);
        }
    }

    public void Bl8(UserJid userJid, boolean z) {
        C78843tk r0 = this.A02;
        if (r0 != null) {
            r0.Bl8(userJid, z);
        }
    }

    public void Bln() {
        C78843tk r0 = this.A02;
        if (r0 != null) {
            r0.Bln();
        }
    }

    public void BqW(UserJid userJid, boolean z) {
        C78843tk r0 = this.A02;
        if (r0 != null) {
            r0.BqW(userJid, z);
        }
    }

    public void C0a(PickerSearchDialogFragment pickerSearchDialogFragment) {
        C78843tk r0 = this.A02;
        if (r0 != null) {
            r0.C0a(pickerSearchDialogFragment);
        }
    }

    public void C9u() {
        C78843tk r0 = this.A02;
        if (r0 != null) {
            r0.C9u();
        }
    }

    public void CMj(DialogFragment dialogFragment) {
        C78843tk r0 = this.A02;
        if (r0 != null) {
            r0.CMj(dialogFragment);
        }
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(A1n());
        this.A01 = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.A00 = bundle;
        return this.A01;
    }

    public void A1w(int i, int i2, Intent intent) {
        super.A1w(i, i2, intent);
        C78843tk r1 = this.A02;
        if (r1 != null) {
            r1.A00.A0D(i, i2, intent);
            r1.A04.A2h(i, i2, intent);
        }
    }

    public void A21(Bundle bundle, View view) {
        C78843tk r3 = new C78843tk(A1n());
        this.A02 = r3;
        r3.A00 = this;
        r3.A01 = this;
        r3.setCustomActionBarEnabled(true);
        r3.A00 = this;
        r3.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.A01.addView(this.A02);
        A1Z(true);
        C78843tk r0 = this.A02;
        C74813cq.A00(r0);
        r0.A01.A00();
        C78843tk r4 = this.A02;
        Bundle bundle2 = this.A00;
        AnonymousClass4aY r02 = r4.A04;
        if (r02 != null) {
            r02.A2Q = r4;
            List list = r4.A0C;
            if (list == null || 0 >= list.size()) {
                r4.A04.A2l(bundle2);
            } else {
                list.get(0);
                throw new NullPointerException("onCreate");
            }
        }
        this.A02.getViewTreeObserver().addOnGlobalLayoutListener(new C90584eJ((Object) this, 0));
        Toolbar toolbar = this.A02.A04.A0f;
        if (toolbar != null) {
            toolbar.setBackgroundColor(A14().getResources().getColor(AnonymousClass1YL.A00(A1n(), 2130970060, 2131101198)));
        }
    }
}
