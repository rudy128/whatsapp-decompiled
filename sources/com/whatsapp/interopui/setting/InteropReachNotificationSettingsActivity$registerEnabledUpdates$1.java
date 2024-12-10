package com.whatsapp.interopui.setting;

import X.AnonymousClass000;
import X.AnonymousClass1G1;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.C23401Fx;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C87334Ve;
import X.C99544t2;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.interopui.notification.InteropNotifOptInViewModel;
import com.whatsapp.wds.components.list.listitem.WDSListItem;
import com.whatsapp.wds.components.toggle.WDSSwitch;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.interopui.setting.InteropReachNotificationSettingsActivity$registerEnabledUpdates$1", f = "InteropReachNotificationSettingsActivity.kt", i = {}, l = {89}, m = "invokeSuspend", n = {}, s = {})
public final class InteropReachNotificationSettingsActivity$registerEnabledUpdates$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ WDSSwitch $chatRequestSettingSwitch;
    public final /* synthetic */ TextView $integratorListHeaderView;
    public final /* synthetic */ RecyclerView $integratorListView;
    public final /* synthetic */ WDSListItem $settingView;
    public int label;
    public final /* synthetic */ InteropReachNotificationSettingsActivity this$0;

    @DebugMetadata(c = "com.whatsapp.interopui.setting.InteropReachNotificationSettingsActivity$registerEnabledUpdates$1$1", f = "InteropReachNotificationSettingsActivity.kt", i = {}, l = {90}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.interopui.setting.InteropReachNotificationSettingsActivity$registerEnabledUpdates$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r9) {
            return new AnonymousClass1(textView, recyclerView, interopReachNotificationSettingsActivity, wDSListItem, wDSSwitch, r9);
        }

        public final Object invokeSuspend(Object obj) {
            C31751g4 r1 = C31751g4.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C30691eM.A01(obj);
                AnonymousClass1G1 r0 = ((InteropNotifOptInViewModel) interopReachNotificationSettingsActivity.A03.getValue()).A05;
                C99544t2 r2 = new C99544t2(textView, wDSListItem, recyclerView, wDSSwitch, 1);
                this.label = 1;
                if (r0.BFC(this, r2) == r1) {
                    return r1;
                }
            } else if (i != 1) {
                throw AnonymousClass000.A0l();
            } else {
                C30691eM.A01(obj);
            }
            throw AnonymousClass3MW.A13();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InteropReachNotificationSettingsActivity$registerEnabledUpdates$1(TextView textView, RecyclerView recyclerView, InteropReachNotificationSettingsActivity interopReachNotificationSettingsActivity, WDSListItem wDSListItem, WDSSwitch wDSSwitch, C30391dr r7) {
        super(2, r7);
        this.this$0 = interopReachNotificationSettingsActivity;
        this.$settingView = wDSListItem;
        this.$chatRequestSettingSwitch = wDSSwitch;
        this.$integratorListHeaderView = textView;
        this.$integratorListView = recyclerView;
    }

    public final C30391dr create(Object obj, C30391dr r9) {
        return new InteropReachNotificationSettingsActivity$registerEnabledUpdates$1(this.$integratorListHeaderView, this.$integratorListView, this.this$0, this.$settingView, this.$chatRequestSettingSwitch, r9);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            final InteropReachNotificationSettingsActivity interopReachNotificationSettingsActivity = this.this$0;
            C23401Fx r0 = C23401Fx.STARTED;
            final WDSListItem wDSListItem = this.$settingView;
            final WDSSwitch wDSSwitch = this.$chatRequestSettingSwitch;
            final TextView textView = this.$integratorListHeaderView;
            final RecyclerView recyclerView = this.$integratorListView;
            AnonymousClass1 r3 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (C87334Ve.A01(r0, interopReachNotificationSettingsActivity, this, r3) == r2) {
                return r2;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((InteropReachNotificationSettingsActivity$registerEnabledUpdates$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
