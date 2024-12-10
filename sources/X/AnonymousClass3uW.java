package X;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import com.whatsapp.reactions.ReactionsTrayViewModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3uW  reason: invalid class name */
public abstract class AnonymousClass3uW extends C75133e3 implements C108875cR, C108665c6, AnonymousClass5ZB {
    public C94604kt A00;
    public List A01 = AnonymousClass000.A13();

    public /* synthetic */ void BC4(Drawable drawable, View view) {
    }

    public /* synthetic */ void BCy(AnonymousClass206 r1) {
    }

    public /* synthetic */ void BCz(AnonymousClass206 r1) {
    }

    public /* synthetic */ void BId() {
    }

    public C74873d3 BRC(Integer num) {
        return null;
    }

    public void Bcy() {
    }

    public /* synthetic */ void C2C(AnonymousClass206 r1) {
    }

    public /* synthetic */ void C2F(AnonymousClass206 r1) {
    }

    public /* synthetic */ void C3D(AnonymousClass206 r1, boolean z) {
    }

    public AnonymousClass1FY CFa() {
        return this;
    }

    public /* synthetic */ void CMe(AnonymousClass206 r1) {
    }

    public /* synthetic */ void CNC(C441822l r1) {
    }

    public /* synthetic */ void CNE(View view, AnonymousClass206 r2, Runnable runnable, int i, int i2, boolean z) {
    }

    public /* synthetic */ void CNF(int i) {
    }

    public /* synthetic */ void setAnimationNye(AnonymousClass205 r1) {
    }

    public /* synthetic */ void setQuotedMessage(AnonymousClass206 r1) {
    }

    public AnonymousClass5YU BHg() {
        return new C92014gc(this.A00);
    }

    public void BIw() {
        AnonymousClass3RQ r0 = this.A00.A0L;
        if (r0 != null) {
            r0.dismiss();
        }
    }

    public void BLL() {
        this.A00.BLL();
    }

    public void BLe(AnonymousClass206 r2) {
        this.A00.BLe(r2);
    }

    public Object BPO(Class cls) {
        return this.A00.BPO(cls);
    }

    public int BW6(AnonymousClass206 r2) {
        return this.A00.BW6(r2);
    }

    public boolean Bcq() {
        return this.A00.Bcq();
    }

    public /* synthetic */ boolean BfZ() {
        return false;
    }

    public boolean Bfa(AnonymousClass206 r2) {
        return this.A00.Bfa(r2);
    }

    public /* synthetic */ boolean Bfy() {
        return false;
    }

    public boolean Bg6() {
        ReactionsTrayViewModel reactionsTrayViewModel = this.A00.A0p;
        if (reactionsTrayViewModel == null || C72463Mc.A0A(reactionsTrayViewModel.A0F) != 2) {
            return false;
        }
        return true;
    }

    public /* synthetic */ boolean Bgu() {
        return false;
    }

    public /* synthetic */ boolean Bjq() {
        return true;
    }

    public void C2U(int i) {
        this.A00.A0C(i);
    }

    public void CH6(AnonymousClass206 r2) {
        this.A00.CH6(r2);
    }

    public void CJr(AnonymousClass206 r2, int i) {
        this.A00.CJr(r2, i);
    }

    public void CKg(List list, boolean z) {
        this.A00.CKg(list, z);
    }

    public /* synthetic */ boolean CMM() {
        return false;
    }

    public void CMb(Bitmap bitmap, AnonymousClass73C r3) {
        this.A00.CMb(bitmap, r3);
    }

    public /* synthetic */ boolean CMu() {
        return false;
    }

    public void CND(View view, AnonymousClass206 r8, int i, int i2, boolean z) {
        this.A00.CND(view, r8, i, i2, z);
    }

    public void COH(AnonymousClass206 r2) {
        this.A00.COH(r2);
    }

    public boolean CPY(AnonymousClass206 r2) {
        return this.A00.CPY(r2);
    }

    public void CRK(AnonymousClass206 r2) {
        this.A00.CRK(r2);
    }

    public C18030ve getABProps() {
        return this.A0E;
    }

    public /* synthetic */ AnonymousClass206 getFirstEverKnownLastMessage() {
        return null;
    }

    public /* synthetic */ AnonymousClass1DS getHasOutgoingMessagesLiveData() {
        return null;
    }

    public /* synthetic */ AnonymousClass1DS getLastMessageLiveData() {
        return null;
    }

    public /* synthetic */ ArrayList getSearchTerms() {
        return null;
    }

    public /* synthetic */ EditText getTextEntryField() {
        return null;
    }

    public AnonymousClass1FD getViewModelStoreOwner() {
        return this;
    }

    public void onCreate(Bundle bundle) {
        if (this.A00 == null) {
            C94604kt AHp = ((C006602x) C000400h.A00(C006602x.class, this)).AHp();
            this.A00 = AHp;
            AHp.A0J = this;
            List list = this.A01;
            if (0 < list.size()) {
                list.get(0);
                throw AnonymousClass000.A0s("onCreate");
            }
        }
        super.onCreate(bundle);
        this.A00.A07();
    }

    public Dialog onCreateDialog(int i) {
        return this.A00.A04(i);
    }

    public void onDestroy() {
        this.A00.A08();
        this.A01.clear();
    }

    public /* synthetic */ boolean Bgo(AnonymousClass206 r2) {
        return false;
    }

    public Dialog C7r(int i) {
        return super.onCreateDialog(i);
    }

    public void C81(AnonymousClass02B r2) {
        super.C81(r2);
        this.A00.A0A();
    }

    public void C82(AnonymousClass02B r2) {
        super.C82(r2);
        this.A00.A0B();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.A00.A0D(i, i2, intent);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A00.A0E(configuration);
    }

    public void onPause() {
        super.onPause();
        this.A00.A09();
    }

    public void onRestoreInstanceState(Bundle bundle) {
        AnonymousClass205 A03;
        super.onRestoreInstanceState(bundle);
        C94604kt r2 = this.A00;
        C94604kt.A02(r2);
        if (bundle != null && (A03 = AnonymousClass4aU.A03(bundle, "")) != null) {
            r2.A0o = AnonymousClass1W2.A01(A03, r2.A14);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        AnonymousClass206 r0 = this.A00.A0o;
        if (r0 != null) {
            AnonymousClass4aU.A0A(bundle, r0.A0v);
        }
    }

    public void C7t() {
        super.onDestroy();
    }
}
