package com.example.data

import android.content.Context
import androidx.datastore.DataStore
import androidx.datastore.preferences.*
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class UserPreferences(
    context: Context
) {

    private val applicationContext = context.applicationContext
    private val dataStore: DataStore<Preferences>


    init {
        dataStore = applicationContext.createDataStore(
            name = "my_data_store"
        )
    }

    val authtoken: Flow<String?>
        get() = dataStore.data.map { preferences ->
            preferences[KEY_AUTH]
        }


    suspend fun saveAuthToken(authtoken: String) {

        dataStore.edit { preferences ->

            preferences[KEY_AUTH] = authtoken

        }

    }

    companion object {
        private val KEY_AUTH = preferencesKey<String>(name = "key_auth")
    }

    suspend fun clear() {
        dataStore.edit { preferences ->

            preferences.clear()

        }

    }
}
