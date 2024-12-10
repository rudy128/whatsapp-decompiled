package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.whatsapp.backup.google.GoogleDriveRestoreAnimationView;
import com.whatsapp.registration.RegisterName;

/* renamed from: X.8dJ  reason: invalid class name and case insensitive filesystem */
public final class C166658dJ extends C161028Bb {
    public int A00 = 0;
    public ProgressBar A01;
    public TextView A02;
    public GoogleDriveRestoreAnimationView A03;
    public final C27431Wb A04;
    public final AnonymousClass1Cd A05;
    public final AnonymousClass1LU A06;
    public final C33841jT A07;
    public final /* synthetic */ RegisterName A08;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C166658dJ(X.AnonymousClass11C r9, X.AnonymousClass11P r10, X.C18000vb r11, X.C27431Wb r12, X.AnonymousClass1Cd r13, X.C18030ve r14, X.AnonymousClass1LU r15, com.whatsapp.registration.RegisterName r16, X.C33841jT r17) {
        /*
            r8 = this;
            r1 = r8
            r2 = r16
            r8.A08 = r2
            r7 = 2131624258(0x7f0e0142, float:1.887569E38)
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0 = 0
            r8.A00 = r0
            r8.A04 = r12
            r8.A05 = r13
            r0 = r17
            r8.A07 = r0
            r8.A06 = r15
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C166658dJ.<init>(X.11C, X.11P, X.0vb, X.1Wb, X.1Cd, X.0ve, X.1LU, com.whatsapp.registration.RegisterName, X.1jT):void");
    }

    public void A00(int i) {
        this.A00 = i;
        if (i == 1) {
            if (this.A03 == null) {
                this.A03 = (GoogleDriveRestoreAnimationView) findViewById(2131434645);
            }
            findViewById(2131434644).setVisibility(8);
            findViewById(2131434645).setVisibility(0);
            this.A01 = (ProgressBar) findViewById(2131434180);
            this.A02 = (TextView) findViewById(2131434191);
            this.A01.setVisibility(0);
            this.A01.setIndeterminate(true);
            this.A02.setVisibility(0);
            this.A03.A01();
        } else if (i == 2) {
            GoogleDriveRestoreAnimationView googleDriveRestoreAnimationView = this.A03;
            if (googleDriveRestoreAnimationView == null) {
                googleDriveRestoreAnimationView = (GoogleDriveRestoreAnimationView) findViewById(2131434645);
                this.A03 = googleDriveRestoreAnimationView;
            }
            googleDriveRestoreAnimationView.A03(false);
            findViewById(2131434644).setVisibility(8);
            ProgressBar progressBar = this.A01;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            TextView textView = this.A02;
            if (textView != null) {
                textView.setVisibility(8);
            }
            TextView textView2 = (TextView) findViewById(2131432811);
            textView2.setVisibility(0);
            C18000vb r7 = this.A02;
            AnonymousClass1Cd r5 = this.A05;
            long A032 = (long) r5.A03();
            Object[] objArr = new Object[1];
            C17880vN.A1T(objArr, r5.A03(), 0);
            String A0K = r7.A0K(objArr, 2131755156, A032);
            C17900vP.A0f("RestoreFromBackupDialog/after-msgstore-verified/ ", A0K, AnonymousClass000.A10());
            textView2.setText(A0K);
            findViewById(2131433119).setVisibility(0);
        }
    }

    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        C28281Zt.A03(AnonymousClass4Z9.A00(getContext(), 2130970286), this);
        AnonymousClass3Ma.A1A(findViewById(2131433765), this, 49);
        AnonymousClass3MZ.A1L(findViewById(2131430127), this, 0);
        AnonymousClass3MZ.A1L(findViewById(2131433119), this, 1);
        if (bundle == null) {
            i = 0;
        } else {
            i = bundle.getInt("state");
        }
        A00(i);
        Window window = getWindow();
        C17960vV.A07(window);
        window.setSoftInputMode(3);
        setTitle(2131886444);
        String A082 = C64052u8.A08(this.A02, this.A04.A0G());
        AnonymousClass3MY.A0y(this.A00, (TextView) findViewById(2131434655), new Object[]{A082}, 2131891803);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 0) {
            return super.onOptionsItemSelected(menuItem);
        }
        this.A07.A0A();
        Activity activity = this.A00;
        activity.startActivity(AnonymousClass1LU.A01(activity));
        return true;
    }

    public Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        onSaveInstanceState.putInt("state", this.A00);
        return onSaveInstanceState;
    }
}
