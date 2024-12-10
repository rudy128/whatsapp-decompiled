package X;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.whatsapp.base.WaDialogFragment;
import com.whatsapp.community.suspend.CommunityIntegrityDeactivatedDialogFragment;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment;
import java.util.concurrent.Callable;

/* renamed from: X.1gg  reason: invalid class name and case insensitive filesystem */
public final class C32121gg implements C203411t {
    public final /* synthetic */ C32111gf A00;

    public C32121gg(C32111gf r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public void BBX(AnonymousClass01E r3, AnonymousClass1EC r4, Integer num) {
        C18070vi.A0d(r3, 0);
        C18070vi.A0d(r4, 1);
        this.A00.BBX(r3, r4, (Integer) null);
    }

    public WaDialogFragment BP0(AnonymousClass1EC r2) {
        return this.A00.BP0(r2);
    }

    public WDSBottomSheetDialogFragment BP2(AnonymousClass1EC r2) {
        return this.A00.BP2(r2);
    }

    public void BhK(Context context, String str) {
        C18070vi.A0d(context, 0);
        C18070vi.A0d(str, 1);
        this.A00.BhK(context, str);
    }

    public void CAm(Context context, View view, GroupJid groupJid) {
        C18070vi.A0d(context, 0);
        C18070vi.A0d(groupJid, 1);
        C18070vi.A0d(view, 2);
        this.A00.CAm(context, view, groupJid);
    }

    public void CAn(View view, Fragment fragment, GroupJid groupJid) {
        C18070vi.A0d(groupJid, 1);
        this.A00.CAn(view, fragment, groupJid);
    }

    public void CAo(Context context, View view, GroupJid groupJid) {
        C18070vi.A0d(context, 0);
        C18070vi.A0d(groupJid, 1);
        C18070vi.A0d(view, 2);
        this.A00.CAo(context, view, groupJid);
    }

    public void CAp(Context context, View view, AnonymousClass1EC r4) {
        C18070vi.A0d(context, 0);
        C18070vi.A0d(view, 2);
        this.A00.CAp(context, view, r4);
    }

    public boolean CAq(Context context, View view, GroupJid groupJid) {
        C18070vi.A0d(context, 0);
        C18070vi.A0d(view, 2);
        return this.A00.CAq(context, view, groupJid);
    }

    public void CAr(Context context, View view, GroupJid groupJid) {
        C18070vi.A0d(groupJid, 1);
        this.A00.CAr(context, view, groupJid);
    }

    public void CAs(View view, Fragment fragment, GroupJid groupJid) {
        C18070vi.A0d(groupJid, 1);
        this.A00.CAs(view, fragment, groupJid);
    }

    public void CAt(Context context, AnonymousClass1BI r3, int i) {
        C18070vi.A0d(context, 0);
        C18070vi.A0d(r3, 1);
        this.A00.CAt(context, r3, i);
    }

    public void CAv(AnonymousClass1BI r3, AnonymousClass3KU r4, int i) {
        this.A00.CAv(r3, r4, 9);
    }

    public void CLY(Context context, AnonymousClass1EC r3) {
        this.A00.CLY(context, r3);
    }

    public void CMf(Context context, DialogInterface.OnClickListener onClickListener, AnonymousClass1EC r4, int i) {
        C18070vi.A0d(r4, 2);
        this.A00.CMf(context, onClickListener, r4, i);
    }

    public void CNK(AnonymousClass1GP r2, AnonymousClass1EC r3, Callable callable) {
        C18070vi.A0d(r2, 1);
        this.A00.CNK(r2, r3, callable);
    }

    public void CNu(Context context, int i, int i2) {
        this.A00.CNu(context, i, i2);
    }

    public void CNv(Context context, AnonymousClass1EC r5, int i, int i2) {
        this.A00.CNv(context, r5, 8, 3);
    }

    public void COG(Context context, AnonymousClass1EC r3) {
        C18070vi.A0d(r3, 1);
        this.A00.COG(context, r3);
    }

    public CommunityIntegrityDeactivatedDialogFragment BP1() {
        return new CommunityIntegrityDeactivatedDialogFragment();
    }
}
