package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.Editable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* renamed from: X.2v6  reason: invalid class name and case insensitive filesystem */
public class C64642v6 implements ActionMode.Callback {
    public Class A00;
    public Method A01;
    public boolean A02;
    public boolean A03 = false;
    public final TextView A04;
    public final ActionMode.Callback A05;

    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.A05.onActionItemClicked(actionMode, menuItem);
    }

    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return this.A05.onCreateActionMode(actionMode, menu);
    }

    public void onDestroyActionMode(ActionMode actionMode) {
        this.A05.onDestroyActionMode(actionMode);
    }

    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        Method declaredMethod;
        boolean z;
        String str;
        TextView textView = this.A04;
        Context context = textView.getContext();
        PackageManager packageManager = context.getPackageManager();
        if (!this.A03) {
            this.A03 = true;
            try {
                Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                this.A00 = cls;
                this.A01 = cls.getDeclaredMethod("removeItemAt", new Class[]{Integer.TYPE});
                this.A02 = true;
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                this.A00 = null;
                this.A01 = null;
                this.A02 = false;
            }
        }
        try {
            if (!this.A02 || !this.A00.isInstance(menu)) {
                declaredMethod = menu.getClass().getDeclaredMethod("removeItemAt", new Class[]{Integer.TYPE});
            } else {
                declaredMethod = this.A01;
            }
            for (int size = menu.size() - 1; size >= 0; size--) {
                MenuItem item = menu.getItem(size);
                if (item.getIntent() != null && C17890vO.A1S(item.getIntent(), "android.intent.action.PROCESS_TEXT")) {
                    Object[] objArr = new Object[1];
                    C17880vN.A1T(objArr, size, 0);
                    declaredMethod.invoke(menu, objArr);
                }
            }
            ArrayList A13 = AnonymousClass000.A13();
            if (context instanceof Activity) {
                for (ResolveInfo next : packageManager.queryIntentActivities(C17880vN.A0A().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0)) {
                    String packageName = context.getPackageName();
                    ActivityInfo activityInfo = next.activityInfo;
                    if (packageName.equals(activityInfo.packageName) || (activityInfo.exported && ((str = activityInfo.permission) == null || context.checkSelfPermission(str) == 0))) {
                        A13.add(next);
                    }
                }
            }
            for (int i = 0; i < A13.size(); i++) {
                ResolveInfo resolveInfo = (ResolveInfo) A13.get(i);
                MenuItem add = menu.add(0, 0, i + 100, resolveInfo.loadLabel(packageManager));
                Intent type = C17880vN.A0A().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
                if ((textView instanceof Editable) && textView.onCheckIsTextEditor()) {
                    z = true;
                    if (textView.isEnabled()) {
                        Intent putExtra = type.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !z);
                        ActivityInfo activityInfo2 = resolveInfo.activityInfo;
                        add.setIntent(putExtra.setClassName(activityInfo2.packageName, activityInfo2.name)).setShowAsAction(1);
                    }
                }
                z = false;
                Intent putExtra2 = type.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !z);
                ActivityInfo activityInfo22 = resolveInfo.activityInfo;
                add.setIntent(putExtra2.setClassName(activityInfo22.packageName, activityInfo22.name)).setShowAsAction(1);
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
        }
        return this.A05.onPrepareActionMode(actionMode, menu);
    }

    public C64642v6(ActionMode.Callback callback, TextView textView) {
        this.A05 = callback;
        this.A04 = textView;
    }

    public ActionMode.Callback A00() {
        return this.A05;
    }
}
