package X;

import android.content.SharedPreferences;
import com.whatsapp.privacy.usernotice.UserNoticeStageUpdateWorker;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1iq  reason: invalid class name and case insensitive filesystem */
public final class C33451iq {
    public final AnonymousClass190 A00;
    public final C18030ve A01;
    public final C33421in A02;
    public final C33431io A03;
    public final AnonymousClass1CM A04;
    public final AnonymousClass11P A05;
    public final AnonymousClass19K A06;
    public final AnonymousClass00H A07;

    public C33451iq(AnonymousClass190 r2, AnonymousClass11P r3, C18030ve r4, C33421in r5, C33431io r6, AnonymousClass1CM r7, AnonymousClass19K r8, AnonymousClass00H r9) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r4, 2);
        C18070vi.A0d(r2, 3);
        C18070vi.A0d(r8, 4);
        C18070vi.A0d(r7, 5);
        C18070vi.A0d(r5, 6);
        C18070vi.A0d(r6, 7);
        C18070vi.A0d(r9, 8);
        this.A05 = r3;
        this.A01 = r4;
        this.A00 = r2;
        this.A06 = r8;
        this.A04 = r7;
        this.A02 = r5;
        this.A03 = r6;
        this.A07 = r9;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x001d A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int A00(X.C59762mq r2, int r3) {
        /*
            r1 = 1
            if (r3 == 0) goto L_0x000b
            r0 = 2
            if (r3 >= r0) goto L_0x000c
            X.2Lt r0 = r2.A02
            if (r0 == 0) goto L_0x0019
            r1 = 2
        L_0x000b:
            return r1
        L_0x000c:
            r0 = 3
            if (r3 < r0) goto L_0x0019
            r0 = 4
            if (r3 >= r0) goto L_0x0017
        L_0x0012:
            X.2Lu r0 = r2.A03
            r1 = 4
            if (r0 != 0) goto L_0x000b
        L_0x0017:
            r1 = 5
            return r1
        L_0x0019:
            X.2Lu r0 = r2.A04
            if (r0 == 0) goto L_0x0012
            r1 = 3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33451iq.A00(X.2mq, int):int");
    }

    public static final C40861vP A01(C59762mq r2, int i) {
        C48262Lu r0;
        if (i == 0 || i == 1) {
            return null;
        }
        if (i != 2) {
            if (i == 3) {
                r0 = r2.A04;
            } else if (i == 4) {
                r0 = r2.A03;
            } else if (i == 5) {
                return null;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected value: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
            if (r0 != null) {
                return r0.A00;
            }
            return null;
        }
        C48252Lt r02 = r2.A02;
        if (r02 != null) {
            return r02.A00;
        }
        return null;
    }

    public final C48252Lt A08() {
        C33431io r7 = this.A03;
        C63592tN A002 = r7.A00();
        if (A002 == null || A002.A00 != 2) {
            return null;
        }
        int i = A002.A01;
        C18030ve r5 = this.A01;
        if (C63802ti.A01(r5, i)) {
            StringBuilder sb = new StringBuilder();
            sb.append("UserNoticeManager/getBanner/green alert disabled, notice: ");
            sb.append(i);
            Log.i(sb.toString());
            return null;
        }
        C59762mq A042 = this.A02.A04(A002);
        if (A042 == null) {
            return null;
        }
        C48252Lt r3 = A042.A02;
        if (r3 == null) {
            Log.e("UserNoticeManager/getBanner/no content for stage 2");
            this.A00.A0G("UserNoticeManager/getBanner/noContent", (String) null, true);
            return null;
        }
        if (C63802ti.A02(r5, A002)) {
            AnonymousClass11P r9 = this.A05;
            C18070vi.A0X(this.A07.get());
            C18100vl r8 = r7.A02;
            long j = ((SharedPreferences) r8.getValue()).getLong("current_user_notice_banner_dismiss_timestamp", 0);
            long A012 = AnonymousClass11P.A01(r9);
            C24521Kq r0 = C24521Kq.$redex_init_class;
            if (A012 < j + 86400000) {
                Log.i("UserNoticeManager/getBanner/dismissed banner not shown as per timing");
                return null;
            }
            Log.i("UserNoticeManager/getBanner/eligible to show dismissible banner");
            ((SharedPreferences) r8.getValue()).edit().putLong("current_user_notice_banner_dismiss_timestamp", 0).apply();
        }
        C40861vP r1 = r3.A00;
        if (!A07(r1, this)) {
            Log.i("UserNoticeManager/getBanner/banner not shown as per timing");
            return null;
        }
        A03(r1, this, C63802ti.A02(r5, A002));
        Log.i("UserNoticeManager/getBanner/banner shown");
        return r3;
    }

    public final void A0C() {
        StringBuilder sb = new StringBuilder();
        sb.append("UserNoticeManager/updateUserNoticeStage/expected current stage: ");
        sb.append(2);
        Log.i(sb.toString());
        C63592tN A002 = this.A03.A00();
        if (A002 != null) {
            int i = A002.A00;
            if (2 < i) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("UserNoticeManager/updateUserNoticeStage/already moved forward, stored current stage: ");
                sb2.append(i);
                Log.i(sb2.toString());
                return;
            }
            C59762mq A042 = this.A02.A04(A002);
            if (A042 != null) {
                A06(A002, A00(A042, 2));
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A02(C59762mq r10, C33451iq r11, C63592tN r12) {
        String str;
        String str2;
        StringBuilder sb;
        C40831vL r0;
        C40831vL r02;
        C40831vL r03;
        int i = r12.A00;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("UserNoticeManager/transitionUserNoticeStageIfNecessary/noticeId: ");
        sb2.append(r12.A01);
        sb2.append(" currentStage: ");
        sb2.append(i);
        Log.i(sb2.toString());
        if (i == 0) {
            Log.i("UserNoticeManager/transitionUserNoticeStageIfNecessary/stage 0, no timing transition needed");
            r11.A06(r12, 1);
            return;
        }
        if (i == 5) {
            str2 = "UserNoticeManager/transitionUserNoticeStageIfNecessary/stage 5, no timing transition needed";
        } else if (r10 == null) {
            str2 = "UserNoticeManager/transitionUserNoticeStageIfNecessary/no content";
        } else {
            long A012 = AnonymousClass11P.A01(r11.A05);
            ArrayList arrayList = new ArrayList();
            C40861vP A013 = A01(r10, i);
            if (!(A013 == null || (r03 = A013.A01) == null)) {
                arrayList.add(new C59442mJ(i, r03.A00, 1));
            }
            int A002 = A00(r10, i);
            int i2 = A002;
            while (A002 < 5) {
                C40861vP A014 = A01(r10, A002);
                if (!(A014 == null || (r02 = A014.A02) == null)) {
                    arrayList.add(new C59442mJ(A002, r02.A00, 0));
                }
                C40861vP A015 = A01(r10, A002);
                if (!(A015 == null || (r0 = A015.A01) == null)) {
                    arrayList.add(new C59442mJ(A002, r0.A00, 1));
                }
                A002++;
            }
            Iterator it = arrayList.iterator();
            C59442mJ r3 = null;
            while (it.hasNext()) {
                C59442mJ r6 = (C59442mJ) it.next();
                if (r6.A02 > A012) {
                    break;
                }
                r3 = r6;
            }
            if (r3 != null) {
                if (r3.A01 == 0) {
                    sb.append("UserNoticeManager/handleEligibleFutureStartEndTiming/passed start timing: ");
                    sb.append(r3.A02);
                    sb.append(" of stage:");
                    int i3 = r3.A00;
                    sb.append(i3);
                    Log.i(sb.toString());
                    r11.A06(r12, i3);
                } else {
                    sb = new StringBuilder();
                    sb.append("UserNoticeManager/handleEligibleFutureStartEndTiming/passed end timing: ");
                    sb.append(r3.A02);
                    sb.append(" of stage: ");
                    int i4 = r3.A00;
                    sb.append(i4);
                    Log.i(sb.toString());
                    r11.A06(r12, A00(r10, i4));
                }
                str2 = "UserNoticeManager/transitionUserNoticeStageIfNecessary/handleEligibleFutureStartEndTiming";
            } else {
                C40861vP A016 = A01(r10, i);
                StringBuilder sb3 = new StringBuilder();
                sb3.append("UserNoticeManager/transitionUserNoticeStageIfNecessary/currentStage = ");
                sb3.append(i);
                sb3.append("  next stage: ");
                sb3.append(i2);
                Log.i(sb3.toString());
                C40861vP A017 = A01(r10, i2);
                if (A017 != null && A017.A02 != null) {
                    str2 = "UserNoticeManager/handleNextStageStartTime/next stage start time exists";
                } else if (A016 == null) {
                    return;
                } else {
                    if (A016.A01 != null) {
                        str2 = "UserNoticeManager/handleCurrentStageEndTiming/current stage end time exists";
                    } else {
                        C40841vM r32 = A016.A00;
                        if (r32 != null) {
                            Log.i("UserNoticeManager/handleCurrentStageDuration/current stage duration exists");
                            long j = r32.A00;
                            if (j != -1) {
                                long j2 = r12.A04;
                                Log.i("UserNoticeManager/handleCurrentStageStaticDuration/static duration exists");
                                if (A012 >= j2 + j) {
                                    str = "UserNoticeManager/handleCurrentStageStaticDuration/current stage static duration expired";
                                } else {
                                    return;
                                }
                            } else {
                                long[] jArr = r32.A01;
                                if (jArr != null) {
                                    Log.i("UserNoticeManager/handleCurrentStageRepeatDuration/repeat duration exists");
                                    if (((SharedPreferences) r11.A03.A02.getValue()).getInt("current_user_notice_duration_repeat_index", 0) > jArr.length) {
                                        str = "UserNoticeManager/handleCurrentStageRepeatDuration/current stage repeat duration complete";
                                    } else {
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            }
                            Log.i(str);
                            r11.A06(r12, i2);
                            return;
                        }
                        return;
                    }
                }
            }
        }
        Log.i(str2);
    }

    public static final void A03(C40861vP r4, C33451iq r5, boolean z) {
        C40841vM r0 = r4.A00;
        if (r0 == null || r0.A01 == null) {
            Log.i("UserNoticeManager/handleRepeatTimingIfNecessary/no repeat duration");
            return;
        }
        Log.i("UserNoticeManager/handleRepeatTimingIfNecessary/set repeat values");
        int i = 1;
        if (!z) {
            i = 1 + ((SharedPreferences) r5.A03.A02.getValue()).getInt("current_user_notice_duration_repeat_index", 0);
        }
        C18100vl r42 = r5.A03.A02;
        ((SharedPreferences) r42.getValue()).edit().putInt("current_user_notice_duration_repeat_index", i).apply();
        ((SharedPreferences) r42.getValue()).edit().putLong("current_user_notice_duration_repeat_timestamp", AnonymousClass11P.A01(r5.A05)).apply();
    }

    public static final void A04(C33451iq r2) {
        Log.i("UserNoticeManager/cleanupAfterDelete");
        ((A7W) r2.A06.get()).A09("tag.whatsapp.usernotice.getStage()update");
        C33421in r1 = r2.A02;
        Log.i("UserNoticeContentManager/cancelWork");
        AnonymousClass19K r22 = r1.A06;
        ((A7W) r22.get()).A09("tag.whatsapp.usernotice.content.fetch");
        ((A7W) r22.get()).A09("tag.whatsapp.usernotice.icon.fetch");
    }

    public static final void A05(C33451iq r6, int i, int i2, int i3) {
        StringBuilder sb = new StringBuilder();
        sb.append("UserNoticeManager/enqueueStageUpdateWork/notice id: ");
        sb.append(i);
        sb.append(" stage: ");
        sb.append(i2);
        sb.append(" version: ");
        sb.append(i3);
        Log.i(sb.toString());
        C192939pH r2 = new C192939pH();
        C17880vN.A1P("notice_id", r2.A00, i);
        C17880vN.A1P("stage", r2.A00, i2);
        C17880vN.A1P("version", r2.A00, i3);
        A6Y A002 = r2.A00();
        A1B a1b = new A1B();
        a1b.A00 = AnonymousClass00R.A01;
        C20078A6e A012 = a1b.A01();
        C196269uj r4 = new C196269uj(UserNoticeStageUpdateWorker.class);
        r4.A07("tag.whatsapp.usernotice.getStage()update");
        r4.A03(A012);
        Integer num = AnonymousClass00R.A00;
        r4.A06(num, TimeUnit.HOURS, 1);
        r4.A04(A002);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("tag.whatsapp.usernotice.getStage()update.");
        sb2.append(i);
        sb2.append('.');
        sb2.append(i2);
        String obj = sb2.toString();
        ((A7W) r6.A06.get()).A07((C162248Jv) r4.A00(), num, obj);
    }

    private final void A06(C63592tN r9, int i) {
        int i2 = r9.A01;
        StringBuilder sb = new StringBuilder();
        sb.append("UserNoticeManager/updateUserNoticeStage/updating to new stage: ");
        sb.append(i);
        sb.append(" noticeId: ");
        sb.append(i2);
        Log.i(sb.toString());
        long A012 = AnonymousClass11P.A01(this.A05);
        int i3 = r9.A03;
        C63592tN r1 = new C63592tN(i2, i, i3, A012, 0);
        C33431io r0 = this.A03;
        r0.A02(r1);
        ((SharedPreferences) r0.A02.getValue()).edit().remove("current_user_notice_duration_repeat_index").remove("current_user_notice_duration_repeat_timestamp").remove("current_user_notice_duration_static_timestamp_start").apply();
        A05(this, i2, i, i3);
    }

    public static final boolean A07(C40861vP r9, C33451iq r10) {
        String obj;
        C40841vM r5 = r9.A00;
        boolean z = true;
        if (r5 == null) {
            obj = "UserNoticeManager/shouldShowStage/no duration";
        } else {
            long A012 = AnonymousClass11P.A01(r10.A05);
            long j = r5.A00;
            if (j != -1) {
                Log.i("UserNoticeManager/shouldShowStageForStaticDuration/has static duration");
                C18100vl r102 = r10.A03.A02;
                long j2 = ((SharedPreferences) r102.getValue()).getLong("current_user_notice_duration_static_timestamp_start", 0);
                if (j2 == 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("UserNoticeManager/shouldShowStageForStaticDuration/static duration start: ");
                    sb.append(A012);
                    Log.i(sb.toString());
                    ((SharedPreferences) r102.getValue()).edit().putLong("current_user_notice_duration_static_timestamp_start", A012).apply();
                    j2 = A012;
                }
                if (A012 >= j2 + j) {
                    Log.i("UserNoticeManager/shouldShowStageForStaticDuration/static duration expired");
                    return false;
                }
                Log.i("UserNoticeManager/shouldShowStageForStaticDuration/static duration valid");
                return true;
            }
            long[] jArr = r5.A01;
            if (jArr == null) {
                obj = "UserNoticeManager/shouldShowStage/no repeat duration";
            } else {
                C18100vl r52 = r10.A03.A02;
                int i = ((SharedPreferences) r52.getValue()).getInt("current_user_notice_duration_repeat_index", 0);
                if (i == 0) {
                    obj = "UserNoticeManager/shouldShowStage/allow first repeat";
                } else if (i > jArr.length) {
                    Log.i("UserNoticeManager/shouldShowStage/no more repeats");
                    return false;
                } else {
                    if (A012 - ((SharedPreferences) r52.getValue()).getLong("current_user_notice_duration_repeat_timestamp", 0) < jArr[i - 1]) {
                        z = false;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("UserNoticeManager/shouldShowStage/repeatTimeElapse: ");
                    sb2.append(z);
                    obj = sb2.toString();
                }
            }
        }
        Log.i(obj);
        return z;
    }

    public final void A09() {
        C63592tN A002 = this.A03.A00();
        if (A002 == null) {
            Log.e("UserNoticeManager/agreeUserNotice/no current notice to agree");
            this.A00.A0G("UserNoticeManager/agreeUserNotice/noContent", (String) null, true);
            return;
        }
        Log.i("UserNoticeManager/agreeUserNotice");
        A06(A002, 5);
    }

    public final void A0A() {
        Log.i("UserNoticeManager/deleteAllUserNoticesWithoutCleanup");
        C33421in r4 = this.A02;
        Log.i("UserNoticeContentManager/deleteAllUserNoticeData");
        File filesDir = r4.A02.A00.getFilesDir();
        C18070vi.A0X(filesDir);
        File A002 = AnonymousClass2UT.A00(filesDir, "user_notice");
        if (A002 != null) {
            r4.A05.CGF(new C21448AkF(A002, 37));
        }
        r4.A00 = null;
        C33431io r2 = this.A03;
        ((SharedPreferences) r2.A02.getValue()).edit().remove("current_user_notice_id").remove("current_user_notice_stage").remove("current_user_notice_stage_timestamp").remove("current_user_notice_version").remove("current_user_notice_duration_repeat_index").remove("current_user_notice_duration_repeat_timestamp").remove("current_user_notice_banner_dismiss_timestamp").remove("user_notices").apply();
        r2.A01.clear();
    }

    public final void A0B() {
        C33431io r1 = this.A03;
        ((SharedPreferences) r1.A02.getValue()).edit().putLong("current_user_notice_banner_dismiss_timestamp", AnonymousClass11P.A01(this.A05)).apply();
    }
}
