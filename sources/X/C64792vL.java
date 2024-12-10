package X;

import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import com.whatsapp.appwidget.WidgetProvider;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.2vL  reason: invalid class name and case insensitive filesystem */
public class C64792vL implements RemoteViewsService.RemoteViewsFactory {
    public final Context A00;
    public final AnonymousClass190 A01;
    public final AnonymousClass1XL A02;
    public final AnonymousClass1M9 A03;
    public final C24921Me A04;
    public final AnonymousClass11P A05;
    public final C18000vb A06;
    public final C18030ve A07;
    public final C217217d A08;
    public final AnonymousClass10I A09;
    public final ArrayList A0A = AnonymousClass000.A13();

    public long getItemId(int i) {
        return (long) i;
    }

    public RemoteViews getLoadingView() {
        return null;
    }

    public synchronized RemoteViews getViewAt(int i) {
        ArrayList arrayList = this.A0A;
        if (i >= arrayList.size()) {
            return null;
        }
        RemoteViews remoteViews = new RemoteViews(this.A00.getPackageName(), 2131627621);
        C55202fO r5 = (C55202fO) arrayList.get(i);
        remoteViews.setTextViewText(2131431392, r5.A02);
        remoteViews.setTextViewText(2131429510, r5.A01);
        remoteViews.setTextViewText(2131429789, r5.A04);
        remoteViews.setContentDescription(2131429789, r5.A03);
        Intent A0A2 = C17880vN.A0A();
        Bundle A0D = C17880vN.A0D();
        A0D.putString("jid", C22971Dz.A06(r5.A00));
        A0A2.putExtras(A0D);
        remoteViews.setOnClickFillInIntent(2131437079, A0A2);
        return remoteViews;
    }

    public int getViewTypeCount() {
        return 1;
    }

    public boolean hasStableIds() {
        return true;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.2fO, java.lang.Object] */
    public synchronized void onDataSetChanged() {
        Log.i("widgetviewsfactory/ondatasetchanged");
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            ArrayList arrayList = WidgetProvider.A0C;
            ArrayList arrayList2 = this.A0A;
            arrayList2.clear();
            if (arrayList != null && this.A02.A07()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    AnonymousClass206 A0Y = C17880vN.A0Y(it);
                    ? obj = new Object();
                    AnonymousClass1BI r4 = A0Y.A0v.A00;
                    if (r4 == null) {
                        this.A01.A0G("UnexpectedNull/WidgetViewsFactory/ChatJID", (String) null, true);
                    }
                    AnonymousClass1E7 A0H = this.A03.A0H(r4);
                    obj.A00 = r4;
                    obj.A02 = C63462t7.A02(this.A04.A0I(A0H));
                    obj.A01 = this.A08.A0I(A0H, A0Y, false, false, true);
                    AnonymousClass11P r5 = this.A05;
                    C18000vb r42 = this.A06;
                    obj.A04 = C64052u8.A0C(r42, r5.A09(A0Y.A0I), false);
                    obj.A03 = C64052u8.A0C(r42, r5.A09(A0Y.A0I), true);
                    arrayList2.add(obj);
                }
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    public int getCount() {
        return this.A0A.size();
    }

    public C64792vL(Context context, AnonymousClass190 r3, AnonymousClass1XL r4, AnonymousClass1M9 r5, C24921Me r6, AnonymousClass11P r7, C18000vb r8, C18030ve r9, C217217d r10, AnonymousClass10I r11) {
        this.A05 = r7;
        this.A07 = r9;
        this.A00 = context;
        this.A01 = r3;
        this.A09 = r11;
        this.A02 = r4;
        this.A03 = r5;
        this.A04 = r6;
        this.A06 = r8;
        this.A08 = r10;
    }

    public void onCreate() {
        Log.i("widgetviewsfactory/oncreate");
        if (C18020vd.A05(C18040vf.A02, this.A07, 12208)) {
            this.A09.CGF(new C70613Bu(this, 42));
        } else {
            onDataSetChanged();
        }
    }

    public void onDestroy() {
        Log.i("widgetviewsfactory/ondestroy");
    }
}
