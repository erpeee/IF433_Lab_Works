package oop_00000119273_SteventRichardoPutra.week08

class ApiParser {

    fun parseProduct(rawJson: Map<String, Any?>): Product? {
        // Ekstrak id dan name dengan requireNotNull [cite: 200]
        val id = requireNotNull(rawJson["id"] as? String) { "API Invalid: Missing ID" }[cite: 200]
        val name = requireNotNull(rawJson["name"] as? String) { "API Invalid: Missing Name" }

        val type = rawJson["type"] as? String [cite: 203]

        return when (type) {
            "ELECTRONIC" -> {
                // Gunakan as? Int dengan fallback Elvis 12 [cite: 203]
                val warranty = rawJson["warranty"] as? Int ?: 12
                Electronic(id, name, warranty)[cite: 204]
            }

            "CLOTHING" -> {
                // Gunakan as? String dengan fallback Elvis "All Size" [cite: 205]
                val size = rawJson["size"] as? String ?: "All Size"
                Clothing(id, name, size)[cite: 205]
            }

            else -> null // Tipe tidak dikenal atau null [cite: 206]
        }
    }
}