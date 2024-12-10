package X;

/* renamed from: X.9iU  reason: invalid class name and case insensitive filesystem */
public final class C189089iU {
    public final String A00(int i) {
        switch (i) {
            case 0:
                return "feature_unavailable";
            case 1:
                return "failed_to_set_server_flag";
            case 2:
                return "failed_to_generate_qr_code";
            case 3:
                return "failed_to_parse_qr_code";
            case 4:
                return "phone_number_mismatch";
            case 5:
                return "failed_to_connect";
            case 6:
                return "cannot_access_chat_storage";
            case 7:
                return "cannot_create_migration_directory";
            case 8:
                return "cannot_write_metadata";
            case 9:
                return "cannot_write_protobuf";
            case 10:
                return "insufficient_disk_space";
            case 11:
                return "cannot_fetch_key";
            case 12:
                return "invalid_key_type";
            case 13:
                return "cannot_create_encryption_zip";
            case 14:
                return "failed_aesgcm_encryption";
            case 15:
                return "lost_connection";
            case 16:
                return "improper_message_received";
            case 17:
                return "cannot_retrieve_key_data";
            case 18:
                return "unexpected_schema";
            case 19:
                return "encryption_zip_not_found";
            case 20:
                return "failed_aesgcm_decryption";
            case 21:
                return "failed_file_management";
            case 22:
                return "messages_zip_not_found";
            case 23:
                return "failed_unzip_message_import";
            case 24:
                return "unknown";
            case 25:
                return "authentication_error";
            case 26:
                return "unable_to_start_server";
            case 27:
                return "wifi_direct_error";
            case 28:
                return "lost_connection_can_continue";
            case 29:
                return "no_xmpp_connection";
            case 30:
                return "unable_to_connect_to_server";
            case 31:
                return "encryption_key_not_found";
            case 32:
                return "decryption_key_mismatch";
            case 33:
                return "encryption_scheme_unsupported";
            case 34:
                return "failed_to_initialize_empty_database";
            case 35:
                return "error_creating_protobuf";
            case 36:
                return "unrecoverable_error";
            case 37:
                return "jabber_id_not_found";
            case 38:
                return "cancellation_error";
            case 39:
                return "needs_sms_verification";
            default:
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("p2p/fpm/LoggingManager/Unknown enum value for ");
                A10.append("FpmErrorCodeType");
                C17900vP.A0i(": ", A10, i);
                return "unknown";
        }
    }
}
