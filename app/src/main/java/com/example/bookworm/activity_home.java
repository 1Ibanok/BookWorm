package com.example.bookworm;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.bookworm.databinding.ActivityHomeBinding;

public class activity_home extends AppCompatActivity {

    private ActivityHomeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Используем ViewBinding для связывания разметки
        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());  // Устанавливаем разметку

        // Дополнительная логика активности
    }
}
