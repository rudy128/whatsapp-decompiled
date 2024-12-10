package com.whatsapp.profile;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass0DT;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1OZ;
import X.AnonymousClass1YL;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3Od;
import X.AnonymousClass48W;
import X.AnonymousClass4YE;
import X.AnonymousClass4Yv;
import X.AnonymousClass4a6;
import X.AnonymousClass4aX;
import X.AnonymousClass4bB;
import X.AnonymousClass75Y;
import X.C000200d;
import X.C108265bP;
import X.C17880vN;
import X.C18070vi;
import X.C23581Gv;
import X.C24671Lf;
import X.C28281Zt;
import X.C52542b5;
import X.C52552b6;
import X.C59932n7;
import X.C72453Mb;
import X.C72473Md;
import X.C72483Me;
import X.C73203Rj;
import X.C89964dJ;
import X.C91024f1;
import X.C94164k9;
import X.C97514pb;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class SetAboutInfo extends AnonymousClass1FY implements C108265bP {
    public static ArrayList A0A;
    public View A00;
    public TextEmojiLabel A01;
    public C24671Lf A02;
    public AnonymousClass3Od A03;
    public AnonymousClass4YE A04;
    public AnonymousClass00H A05;
    public boolean A06;
    public boolean A07;
    public final Handler A08;
    public final C23581Gv A09;

    public SetAboutInfo() {
        this(0);
        this.A08 = new Handler(Looper.getMainLooper(), new AnonymousClass75Y(this, 5));
        this.A09 = new C94164k9(this, 23);
    }

    public void Bmf(String str) {
    }

    public void Bnk(int i) {
        if (i == 4) {
            this.A04.A01(2);
        }
    }

    public void BsU(int i, String str) {
        if (i == 4 && str.length() > 0 && !str.equals(AnonymousClass3MZ.A18(this.A01))) {
            this.A00.setOnClickListener((View.OnClickListener) null);
            A4b(str);
            this.A04.A01(1);
        }
    }

    public Dialog onCreateDialog(int i) {
        String str;
        int i2;
        if (i == 0) {
            str = getString(2131891349);
            i2 = 2131891348;
        } else if (i == 1) {
            str = getString(2131891347);
            i2 = 2131891346;
        } else if (i == 2) {
            ProgressDialog progressDialog = new ProgressDialog(this);
            progressDialog.setMessage(getString(2131891349));
            progressDialog.setIndeterminate(true);
            progressDialog.setCancelable(false);
            return progressDialog;
        } else if (i != 3) {
            return super.onCreateDialog(i);
        } else {
            C73203Rj A002 = AnonymousClass4a6.A00(this);
            A002.A0D(2131889279);
            return C73203Rj.A00(new AnonymousClass4bB(this, 39), A002, 2131889277);
        }
        return ProgressDialog.show(this, str, getString(i2), true, false);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 0, 0, 2131889277);
        return true;
    }

    public static void A03(SetAboutInfo setAboutInfo) {
        ObjectOutputStream objectOutputStream;
        try {
            objectOutputStream = new ObjectOutputStream(setAboutInfo.openFileOutput("status", 0));
            StringBuilder A10 = AnonymousClass000.A10();
            Iterator it = A0A.iterator();
            while (it.hasNext()) {
                A10.append(C17880vN.A0v(it));
                A10.append("\n");
            }
            if (A10.length() > 1) {
                A10.deleteCharAt(A10.length() - 1);
            }
            objectOutputStream.writeObject(A10.toString());
            objectOutputStream.close();
            return;
        } catch (IOException e) {
            Log.e("SetStatus/writeStatusListString", e);
            return;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
        }
        throw th;
    }

    public void A2y() {
        if (!this.A07) {
            this.A07 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
            this.A05 = C000200d.A00(A0L.A05);
            this.A04 = (AnonymousClass4YE) r1.AD4.get();
            this.A02 = AnonymousClass3Ma.A0S(A0L);
        }
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.Object, X.2Rw] */
    public void A4b(String str) {
        if (!A47(2131886169)) {
            AnonymousClass4Yv.A01(this, 2);
            C52542b5 r5 = new C52542b5(this);
            C97514pb r3 = new C97514pb(this, 3);
            C52552b6 r1 = new C52552b6(this);
            AnonymousClass1OZ A0U = C17880vN.A0U(((C59932n7) this.A05.get()).A05);
            ? obj = new Object();
            obj.A03 = str;
            obj.A00 = r5;
            obj.A02 = r3;
            obj.A01 = r1;
            Message obtain = Message.obtain((Handler) null, 0, 29, 0, obj);
            C18070vi.A0X(obtain);
            if (!A0U.A0M(obtain)) {
                Handler handler = this.A08;
                handler.removeMessages(0);
                handler.sendEmptyMessage(0);
            }
            this.A08.sendEmptyMessageDelayed(0, 32000);
        }
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (AdapterView.AdapterContextMenuInfo) menuItem.getMenuInfo();
        if (menuItem.getItemId() == 1) {
            A0A.remove(adapterContextMenuInfo.position);
            this.A03.notifyDataSetChanged();
            A03(this);
            this.A04.A01(4);
        }
        return true;
    }

    /* JADX INFO: finally extract failed */
    public void onCreate(Bundle bundle) {
        ObjectInputStream objectInputStream;
        super.onCreate(bundle);
        setTitle(2131892378);
        C72473Md.A18(this);
        setContentView(2131626895);
        View findViewById = findViewById(2131435654);
        this.A00 = findViewById;
        C89964dJ.A00(findViewById, this, 42);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) findViewById(2131435713);
        this.A01 = textEmojiLabel;
        textEmojiLabel.A0R(C72453Mb.A10(this.A05));
        if (C17880vN.A0e(getFilesDir(), "status").exists()) {
            try {
                objectInputStream = new ObjectInputStream(openFileInput("status"));
                ArrayList A13 = AnonymousClass000.A13();
                A0A = A13;
                for (String str : ((String) objectInputStream.readObject()).split("\n")) {
                    if (str.length() > 0) {
                        A13.add(str);
                    }
                }
                objectInputStream.close();
            } catch (ClassNotFoundException e) {
                Log.w("create/status/serialization_error", e);
            } catch (IOException e2) {
                Log.e((Throwable) e2);
            } catch (Throwable th) {
                AnonymousClass0DT.A00(th, th);
            }
            AbsListView absListView = (AbsListView) findViewById(2131432069);
            absListView.setEmptyView(findViewById(2131432081));
            AnonymousClass3Od r0 = new AnonymousClass3Od(this, this, A0A);
            this.A03 = r0;
            absListView.setAdapter(r0);
            absListView.setOnItemClickListener(new AnonymousClass48W(this.A05, this));
            registerForContextMenu(absListView);
            this.A02.registerObserver(this.A09);
            AnonymousClass4aX.A0D(AnonymousClass3MX.A0I(this, 2131435714), C28281Zt.A00(this, 2130971146, AnonymousClass1YL.A00(this, 2130971193, 2131102529)));
            return;
        }
        TypedArray obtainTypedArray = getResources().obtainTypedArray(2130903050);
        try {
            ArrayList A132 = AnonymousClass000.A13();
            for (int i = 0; i < obtainTypedArray.length(); i++) {
                A132.add(obtainTypedArray.getString(i));
            }
            obtainTypedArray.recycle();
            A0A = A132;
            AbsListView absListView2 = (AbsListView) findViewById(2131432069);
            absListView2.setEmptyView(findViewById(2131432081));
            AnonymousClass3Od r02 = new AnonymousClass3Od(this, this, A0A);
            this.A03 = r02;
            absListView2.setAdapter(r02);
            absListView2.setOnItemClickListener(new AnonymousClass48W(this.A05, this));
            registerForContextMenu(absListView2);
            this.A02.registerObserver(this.A09);
            AnonymousClass4aX.A0D(AnonymousClass3MX.A0I(this, 2131435714), C28281Zt.A00(this, 2130971146, AnonymousClass1YL.A00(this, 2130971193, 2131102529)));
            return;
        } catch (Throwable th2) {
            obtainTypedArray.recycle();
            throw th2;
        }
        throw th;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        contextMenu.add(0, 1, 0, 2131889308);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A02.unregisterObserver(this.A09);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId != 0) {
            if (itemId != 16908332) {
                return super.onOptionsItemSelected(menuItem);
            }
            finish();
            return true;
        } else if (A0A.size() == 0) {
            BhQ(2131892927);
            return true;
        } else {
            AnonymousClass4Yv.A01(this, 3);
            return true;
        }
    }

    public SetAboutInfo(int i) {
        this.A07 = false;
        C91024f1.A00(this, 38);
    }
}
