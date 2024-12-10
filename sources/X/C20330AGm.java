package X;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.CompoundButton;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.LegacyMessageDialogFragment;
import com.whatsapp.group.NonAdminGJRFragment;
import com.whatsapp.payments.ui.IndiaUpiProfileDetailsActivity;
import com.whatsapp.payments.ui.mapper.register.IndiaUpiCreateCustomNumberActivity;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.AGm  reason: case insensitive filesystem */
public class C20330AGm implements C22851Dl {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C20330AGm(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void Bo9(Object obj) {
        String str;
        Runnable runnable;
        switch (this.A00) {
            case 0:
                List list = (List) obj;
                ((View) this.A01).setVisibility(C108975cc.A1J(list) ? 1 : 0);
                C172648tl r0 = ((NonAdminGJRFragment) this.A02).A01;
                if (r0 == null) {
                    str = "nonAdminGJRAdapter";
                    break;
                } else {
                    r0.A01 = list;
                    r0.notifyDataSetChanged();
                    return;
                }
            case 1:
                C20039A4i.A01((C20039A4i) this.A01, ((CompoundButton) this.A02).isChecked());
                return;
            case 2:
                C161688Hi r5 = (C161688Hi) this.A02;
                HashMap A11 = C17880vN.A11();
                for (B7D b7d : (List) obj) {
                    if (b7d instanceof ANM) {
                        C20287AEv aEv = ((ANM) b7d).A00;
                        List list2 = aEv.A0A;
                        if (!list2.isEmpty()) {
                            A11.put(aEv.A0H, C108955ca.A0p(list2));
                        }
                    }
                }
                r5.A00.putAll(A11);
                r5.notifyDataSetChanged();
                return;
            case 3:
                A1K a1k = (A1K) this.A01;
                DialogFragment dialogFragment = (DialogFragment) this.A02;
                int A0M = AnonymousClass000.A0M(obj);
                if (A0M == 1) {
                    Log.i("Start pay flow event received");
                    dialogFragment.A28();
                    runnable = a1k.A02;
                } else if (A0M != 2) {
                    if (A0M == 3) {
                        Log.i("Dismiss event received");
                    } else if (A0M != 4) {
                        Log.i("None event received");
                        return;
                    }
                    dialogFragment.A28();
                    return;
                } else {
                    Log.i("Invite sent event received");
                    dialogFragment.A28();
                    runnable = a1k.A01;
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 4:
                IndiaUpiCreateCustomNumberActivity indiaUpiCreateCustomNumberActivity = (IndiaUpiCreateCustomNumberActivity) this.A01;
                C1418477e r52 = (C1418477e) this.A02;
                AnonymousClass9MW r12 = (AnonymousClass9MW) obj;
                C18070vi.A0d(r12, 2);
                if ((r12 instanceof C1763693v) || (r12 instanceof C1763793w)) {
                    IndiaUpiCreateCustomNumberActivity.A0Q(indiaUpiCreateCustomNumberActivity);
                    if (r52 != null) {
                        String stringExtra = indiaUpiCreateCustomNumberActivity.getIntent().getStringExtra("extra_referral_screen");
                        Intent A07 = AnonymousClass8BR.A07(indiaUpiCreateCustomNumberActivity, IndiaUpiProfileDetailsActivity.class);
                        A07.putExtra("extra_payment_name", r52);
                        A07.putExtra("extra_referral_screen", stringExtra);
                        A07.setFlags(335544320);
                        indiaUpiCreateCustomNumberActivity.startActivity(A07);
                        return;
                    }
                    return;
                } else if (r12 instanceof AnonymousClass93x) {
                    CircularProgressBar circularProgressBar = indiaUpiCreateCustomNumberActivity.A02;
                    if (circularProgressBar == null) {
                        str = "progressBar";
                        break;
                    } else {
                        circularProgressBar.setVisibility(0);
                        WDSButton wDSButton = indiaUpiCreateCustomNumberActivity.A06;
                        if (wDSButton == null) {
                            str = "continueButton";
                            break;
                        } else {
                            AnonymousClass3MW.A1S(wDSButton);
                            return;
                        }
                    }
                } else if (r12 instanceof C1763593t) {
                    C1763593t r122 = (C1763593t) r12;
                    C20112A7u A03 = C20112A7u.A03(new C20112A7u[0]);
                    int i = r122.A00;
                    A03.A07("payments_error_code", String.valueOf(i));
                    A03.A07("payments_error_text", r122.A02);
                    AZ6 az6 = indiaUpiCreateCustomNumberActivity.A05;
                    if (az6 == null) {
                        str = "fieldStatsLogger";
                        break;
                    } else {
                        az6.BiM(A03, AnonymousClass8BS.A0V(), "create_numeric_upi_alias", AnonymousClass8BX.A0Y(indiaUpiCreateCustomNumberActivity), 4);
                        IndiaUpiCreateCustomNumberActivity.A0Q(indiaUpiCreateCustomNumberActivity);
                        C20752AXh aXh = indiaUpiCreateCustomNumberActivity.A04;
                        if (aXh == null) {
                            str = "indiaUpiErrorHelper";
                            break;
                        } else {
                            C19967A1c A022 = aXh.A02((C196259ui) null, i);
                            if (A022.A00 == 0) {
                                A022.A00 = 2131893867;
                            }
                            String A002 = A022.A00(indiaUpiCreateCustomNumberActivity);
                            LegacyMessageDialogFragment legacyMessageDialogFragment = new LegacyMessageDialogFragment();
                            legacyMessageDialogFragment.A1R(AnonymousClass8BX.A0E(A002));
                            AnonymousClass3MY.A1H(legacyMessageDialogFragment, indiaUpiCreateCustomNumberActivity, (String) null);
                            return;
                        }
                    }
                } else {
                    IndiaUpiCreateCustomNumberActivity.A0Q(indiaUpiCreateCustomNumberActivity);
                    Log.e("Unexpected value for indiaUpiMapperLinkEvent");
                    return;
                }
                break;
            default:
                AnonymousClass8Ho r53 = (AnonymousClass8Ho) this.A02;
                HashMap A112 = C17880vN.A11();
                for (B7D b7d2 : (List) obj) {
                    if (b7d2 instanceof ANM) {
                        C20287AEv aEv2 = ((ANM) b7d2).A00;
                        List list3 = aEv2.A0A;
                        if (!list3.isEmpty()) {
                            A112.put(aEv2.A0H, C108955ca.A0p(list3));
                        }
                    }
                }
                int i2 = 0;
                while (true) {
                    List list4 = r53.A0E;
                    if (i2 < list4.size()) {
                        C183399Yc r2 = (C183399Yc) list4.get(i2);
                        if (r2 instanceof AnonymousClass94A) {
                            AnonymousClass94A r22 = (AnonymousClass94A) r2;
                            String A003 = r22.A01.A00();
                            if (!TextUtils.isEmpty(A003) && A112.containsKey(A003)) {
                                r22.A00 = (AEI) A112.get(A003);
                                r53.A0G(i2);
                            }
                        }
                        i2++;
                    } else {
                        return;
                    }
                }
        }
        C18070vi.A11(str);
        throw null;
    }
}
