// Generated by Dagger (https://dagger.dev).
package com.omar_aly.todo_list.di;

import com.omar_aly.todo_list.repository.TaskRepository;
import com.omar_aly.todo_list.usecase.SetTaskDoneUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class UseCaseModule_ProvideSetTaskDoneUseCaseFactory implements Factory<SetTaskDoneUseCase> {
  private final Provider<TaskRepository> taskRepositoryProvider;

  public UseCaseModule_ProvideSetTaskDoneUseCaseFactory(
      Provider<TaskRepository> taskRepositoryProvider) {
    this.taskRepositoryProvider = taskRepositoryProvider;
  }

  @Override
  public SetTaskDoneUseCase get() {
    return provideSetTaskDoneUseCase(taskRepositoryProvider.get());
  }

  public static UseCaseModule_ProvideSetTaskDoneUseCaseFactory create(
      Provider<TaskRepository> taskRepositoryProvider) {
    return new UseCaseModule_ProvideSetTaskDoneUseCaseFactory(taskRepositoryProvider);
  }

  public static SetTaskDoneUseCase provideSetTaskDoneUseCase(TaskRepository taskRepository) {
    return Preconditions.checkNotNullFromProvides(UseCaseModule.INSTANCE.provideSetTaskDoneUseCase(taskRepository));
  }
}
