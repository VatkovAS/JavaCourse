package ru.turing.courses.lesson3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

    public class Registry<T> {
        private final Map<String, T> storage = new HashMap<>();

        //todo написать и реализовать методы
        /**
         * Функция для добавления новой записи в реестр
         *
         * @param key   ключ
         * @param value значение записи
         */
        public T add(String key, T value) {
            return this.storage.put(key, value);
        }

        /**
         * Функция, удаляющая запись из реестра по ключу
         *
         * @param key ключ
         * @return возвращает значение удаленной записи
         */
        public T removeByKey(String key) {
            return this.storage.remove(key);
        }

        /**
         * Удаление по значению
         * @param value значение, записи с которым нужно удалить
         * @return список ключей удаленных записей
         */
        public List<String> removeByValue(T value) {
            List<String> result = new ArrayList<>();
            this.storage.entrySet().removeIf(entry -> {
                if (entry.getValue().equals(value)) {
                    result.add(entry.getKey());
                    return true;
                }
                return false;
            });
            return result;
        }

        /**
         * Очистка реестра
         */
        public void clear() {
            this.storage.clear();
        }

        /**
         * Получение значения по ключу из реестра
         *
         * @param key ключ
         * @return значение записи по этому ключу
         */
        public T getByKey(String key) {
            return this.storage.get(key);
        }

        /**
         * Получение всех значений по имени
         * @param name  имя, по которому получаются значения
         * @return  множество всех записей с таким именем
         */
        public List<T> getByName(String name) {
            List<T> values = new ArrayList<>();
            for (Map.Entry<String, T> entry : this.storage.entrySet()) {
                if (entry.getValue().toString().equals(name)) {
                    values.add(entry.getValue());
                }
            }
            return values;
        }

        public boolean containsKey(String key) {
            return this.storage.containsKey(key);
        }

        public boolean containsValue(T value) {
            return this.storage.containsValue(value);
        }

        public int size() {
            return this.storage.size();
        }
    }