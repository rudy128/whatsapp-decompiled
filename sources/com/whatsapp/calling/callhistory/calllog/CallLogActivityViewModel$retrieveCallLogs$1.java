package com.whatsapp.calling.callhistory.calllog;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.callhistory.calllog.CallLogActivityViewModel$retrieveCallLogs$1", f = "CallLogActivityViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CallLogActivityViewModel$retrieveCallLogs$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ CallLogActivityViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallLogActivityViewModel$retrieveCallLogs$1(CallLogActivityViewModel callLogActivityViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = callLogActivityViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new CallLogActivityViewModel$retrieveCallLogs$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new CallLogActivityViewModel$retrieveCallLogs$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:9:0x0049=Splitter:B:9:0x0049, B:21:0x0099=Splitter:B:21:0x0099} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.label
            if (r0 != 0) goto L_0x00f1
            X.C30691eM.A01(r8)
            X.1Dv r1 = X.AnonymousClass1BI.A00
            com.whatsapp.calling.callhistory.calllog.CallLogActivityViewModel r0 = r7.this$0
            java.lang.String r0 = r0.A0O
            X.1BI r6 = r1.A02(r0)
            if (r6 == 0) goto L_0x00ec
            boolean r1 = X.C22971Dz.A0e(r6)
            com.whatsapp.calling.callhistory.calllog.CallLogActivityViewModel r0 = r7.this$0
            if (r1 == 0) goto L_0x005a
            X.1TB r4 = r0.A08
            r2 = 100
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            r0 = 2
            java.lang.String[] r5 = new java.lang.String[r0]
            X.1LW r0 = r4.A02
            long r0 = r0.A09(r6)
            X.C17890vO.A1J(r5, r0)
            r1 = 1
            java.lang.String r0 = java.lang.Integer.toString(r2)
            r5[r1] = r0
            X.1Cd r0 = r4.A06
            X.1at r6 = r0.get()
            r0 = r6
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00e2 }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x00e2 }
            java.lang.String r1 = "SELECT call_log._id, call_log.call_id, call_log.jid_row_id, call_log.from_me, transaction_id, call_log.timestamp, video_call, duration, call_log.call_result, is_dnd_mode_on, bytes_transferred, call_log.group_jid_row_id, is_joinable_group_call, call_creator_device_jid_row_id, call_random_id, call_type, offer_silence_reason, scheduled_id, joinable_call_log.call_log_row_id, joinable_video_call, call_link._id AS call_link_id, token, creator_jid_row_id FROM message JOIN message_call_log ON message_row_id = message._id JOIN call_log ON call_log._id = message_call_log.call_log_row_id LEFT JOIN joinable_call_log ON joinable_call_log.call_log_row_id = call_log._id LEFT JOIN call_link ON call_link._id = call_link_row_id WHERE message_type = 90  AND chat_row_id = ?  AND joinable_call_log.call_log_row_id IS NULL  ORDER BY sort_id DESC LIMIT ?"
            java.lang.String r0 = "GET_CALL_LOGS_FOR_GROUP_CALL_INFO_SQL"
            android.database.Cursor r2 = r2.A0A(r1, r0, r5)     // Catch:{ all -> 0x00e2 }
        L_0x0049:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x00d6 }
            if (r0 == 0) goto L_0x00aa
            r0 = 0
            X.9Bw r0 = X.AnonymousClass1TB.A01(r2, r0, r4)     // Catch:{ all -> 0x00d6 }
            if (r0 == 0) goto L_0x0049
            r3.add(r0)     // Catch:{ all -> 0x00d6 }
            goto L_0x0049
        L_0x005a:
            X.00H r0 = r0.A0J
            java.lang.Object r0 = r0.get()
            X.1NG r0 = (X.AnonymousClass1NG) r0
            X.1BI r1 = r0.A01(r6)
            com.whatsapp.calling.callhistory.calllog.CallLogActivityViewModel r0 = r7.this$0
            X.1TB r4 = r0.A08
            if (r1 == 0) goto L_0x006d
            r6 = r1
        L_0x006d:
            r2 = 100
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            r0 = 2
            java.lang.String[] r5 = new java.lang.String[r0]
            X.1LW r0 = r4.A02
            long r0 = r0.A09(r6)
            X.C17890vO.A1J(r5, r0)
            r1 = 1
            java.lang.String r0 = java.lang.Integer.toString(r2)
            r5[r1] = r0
            X.1Cd r0 = r4.A06
            X.1at r6 = r0.get()
            r0 = r6
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00e2 }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x00e2 }
            java.lang.String r1 = "SELECT call_log._id, call_log.call_id, call_log.jid_row_id, call_log.from_me, transaction_id, call_log.timestamp, video_call, duration, call_log.call_result, is_dnd_mode_on, bytes_transferred, call_log.group_jid_row_id, is_joinable_group_call, call_creator_device_jid_row_id, call_random_id, call_type, offer_silence_reason, scheduled_id, joinable_call_log.call_log_row_id, joinable_video_call, call_link._id AS call_link_id, token, creator_jid_row_id FROM message JOIN message_call_log ON message_row_id = message._id JOIN call_log ON call_log._id = message_call_log.call_log_row_id LEFT JOIN joinable_call_log ON joinable_call_log.call_log_row_id = call_log._id LEFT JOIN call_link ON call_link._id = call_link_row_id LEFT JOIN call_log_participant_v2 ON call_log_participant_v2.call_log_row_id = call_log._id WHERE message_type = 90  AND chat_row_id = ?  AND call_log.group_jid_row_id = 0  AND call_log_participant_v2.call_log_row_id IS NULL  AND joinable_call_log.call_log_row_id IS NULL  ORDER BY sort_id DESC LIMIT ?"
            java.lang.String r0 = "GET_CALL_LOGS_FOR_USER_CALL_INFO_SQL"
            android.database.Cursor r2 = r2.A0A(r1, r0, r5)     // Catch:{ all -> 0x00e2 }
        L_0x0099:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x00d6 }
            if (r0 == 0) goto L_0x00aa
            r0 = 0
            X.9Bw r0 = X.AnonymousClass1TB.A01(r2, r0, r4)     // Catch:{ all -> 0x00d6 }
            if (r0 == 0) goto L_0x0099
            r3.add(r0)     // Catch:{ all -> 0x00d6 }
            goto L_0x0099
        L_0x00aa:
            r2.close()     // Catch:{ all -> 0x00e2 }
            r6.close()
            com.whatsapp.calling.callhistory.calllog.CallLogActivityViewModel r2 = r7.this$0
            X.1G4 r1 = r2.A0T
            java.util.List r0 = com.whatsapp.calling.callhistory.calllog.CallLogActivityViewModel.A05(r2, r3)
            java.util.List r0 = com.whatsapp.calling.callhistory.calllog.CallLogActivityViewModel.A07(r2, r0)
            java.util.List r0 = com.whatsapp.calling.callhistory.calllog.CallLogActivityViewModel.A06(r2, r0)
            r1.setValue(r0)
            com.whatsapp.calling.callhistory.calllog.CallLogActivityViewModel r1 = r7.this$0
            java.lang.Object r0 = X.C29431cG.A0c(r3)
            X.9Bw r0 = (X.C178119Bw) r0
            if (r0 == 0) goto L_0x00d4
            X.4cT r0 = r0.A04
        L_0x00cf:
            r1.A00 = r0
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x00d4:
            r0 = 0
            goto L_0x00cf
        L_0x00d6:
            r1 = move-exception
            if (r2 == 0) goto L_0x00e1
            r2.close()     // Catch:{ all -> 0x00dd }
            goto L_0x00e1
        L_0x00dd:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x00e2 }
        L_0x00e1:
            throw r1     // Catch:{ all -> 0x00e2 }
        L_0x00e2:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x00e7 }
            throw r1
        L_0x00e7:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        L_0x00ec:
            java.lang.IllegalArgumentException r1 = X.C17890vO.A0K()
            throw r1
        L_0x00f1:
            java.lang.IllegalStateException r1 = X.AnonymousClass000.A0l()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callhistory.calllog.CallLogActivityViewModel$retrieveCallLogs$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
